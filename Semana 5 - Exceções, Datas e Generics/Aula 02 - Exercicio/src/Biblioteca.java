import java.util.HashSet;
import java.util.Set;

public class Biblioteca {

    Set<Livro> acervoDeLivros = new HashSet<>();

    public Set<Livro> getAcervoDeLivros() {
        System.out.println("-----");
        System.out.println("O acervo atualmente possui os seguintes titulos: ");
        return this.acervoDeLivros;
    }

    public void adicionarLivro(Livro livro) {
        this.acervoDeLivros.add(livro);
    }

    public void emprestarLivro(Livro livro, Usuario usuario)
            throws LimiteLivrosExcedidoException, LivroIndisponivelException {
        try {

            if (livro.isEmprestado()) {
                throw new LivroIndisponivelException();
            } else {
                usuario.pegarEmprestado(livro);
                System.out.println("-----");
                System.out
                        .println("Livro '" + livro.getNome() + "' foi emprestado para o usuário: " + usuario.getNome());
            }
        } catch (LimiteLivrosExcedidoException e) {
            System.out.println("-----");
            System.out.println("Erro ao emprestar o livro: " + e.getMessage());
        } catch (LivroIndisponivelException e) {
            System.out.println("-----");
            System.out.println("Erro ao emprestar o livro: " + e.getMessage());
        }

    }

    public void devolverLivro(Livro livro, Usuario usuario) {

    }

}
