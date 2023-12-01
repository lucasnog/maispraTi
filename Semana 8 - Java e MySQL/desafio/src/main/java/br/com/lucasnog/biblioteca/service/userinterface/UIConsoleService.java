package br.com.lucasnog.biblioteca.service.userinterface;

import br.com.lucasnog.biblioteca.model.Livro;
import br.com.lucasnog.biblioteca.service.IUIService;
import br.com.lucasnog.biblioteca.service.repository.LivroRepository;

import java.util.Scanner;

public class UIConsoleService implements IUIService {
    String titulo, autor, status;
    Integer anoPub;

    private Scanner sc = new Scanner(System.in);
    private LivroRepository livroRepository = new LivroRepository();
    int entrada;

    @Override
    public Integer menuPrincipal() {
        System.out.println("Bem-vindo ao Sistema de Gerenciamento de Biblioteca");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Adicionar um Livro.");
        System.out.println("2 - Ver todos os livros");
        System.out.println("3 - Alugar um Livro.");
        System.out.println("4 - Devolver um Livro");
        System.out.println("5 - Ver Livros Alugados");
        System.out.println("6 - Ver Livros Disponíveis");
        System.out.println("7 - Deletar livro");
        System.out.println("8 - Sair");

        return sc.nextInt();

    }

    @Override
    public String entradaTituloLivro() {
        System.out.println("Digite o nome do livro:");
        return sc.next();
    }


    @Override
    public Livro addLivro() {
        titulo = entradaTituloLivro();

        System.out.println("Digite o nome do autor:");
        autor = sc.next();

        System.out.println("Digite o ano de publicação do livro:");
        anoPub = sc.nextInt();

        Livro livro = new Livro(titulo, autor, anoPub);

        return livro;
    }

    @Override
    public void showAll() {
        System.out.println("Os livros cadastrados no sistema são:");
        System.out.println(livroRepository.readAll());
    }

    @Override
    public void alugarLivro() {
        System.out.println("Digite o id do livro");
        Integer idLivro = sc.nextInt();

        Livro livroParaAlugar = livroRepository.readById(idLivro);
        if (livroParaAlugar != null && livroParaAlugar.getStatus().equals("Disponivel")) {
            livroParaAlugar.setStatus("Alugado");
            livroRepository.update(livroParaAlugar);

            System.out.println("Livro alugado com sucesso!");
        } else {
            System.out.println("Livro não encontrado ou não disponível para alugar.");

        }
    }

    @Override
    public void devolverLivro() {
        System.out.println("Digite o id do livro");
        Integer idLivro = sc.nextInt();

        Livro livroParaAlugar = livroRepository.readById(idLivro);
        if (livroParaAlugar != null && livroParaAlugar.getStatus().equals("Alugado")) {
            livroParaAlugar.setStatus("Disponivel");
            livroRepository.update(livroParaAlugar);

            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro não está alugado ou não existe.");

        }
    }

    @Override
    public void showRented() {
        System.out.println("Os livros alugados são:");
        System.out.println(livroRepository.readByStatus("Alugado"));
    }

    @Override
    public void showAvailable() {
        System.out.println("Os livros disponiveis são:");
        System.out.println(livroRepository.readByStatus("Disponivel"));
    }

    @Override
    public void deletarLivro() {
        System.out.println("Digite o id do livro");
        Integer idLivro = sc.nextInt();

        livroRepository.delete(idLivro);
    }

    @Override
    public boolean sair() {
        System.out.println("Até logo!");
        return false;
    }
}
