import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    List<Livro> acervo = new ArrayList<>();
    Set<String> categorias = new HashSet<>();

    public List<Livro> listLivros() {
        System.out.println("------");
        System.out.println("Livros disponiveis em nosso acervo:");
        return acervo;
    }

    public void addLivro(Livro livro) {
        System.out.println("------");
        System.out.println("Livro: " + livro.titulo + " adicionado com sucesso no nosso acervo.");
        this.acervo.add(livro);
        categorias.add(livro.categoria);
    }

    public Set<String> listarCategorias() {
        System.out.println("------");
        System.out.println("Exibindo todas as categorias disponiveis em nosso acervo:");
        return categorias;
    }

    public void addCategoria(String categorias) {
        this.categorias.add(categorias);
    }

    public void buscarPorCategoria(String categoria) {
        System.out.println("------");
        System.out.println("Exibindo todos os livros da categoria '" + categoria + "':");

        for (int i = 0; i < acervo.size(); i++) {
            Livro livro = acervo.get(i);
            if (livro.getCategoria().equals(categoria)) {
                System.out.println(livro);
            }
        }

    }
}
