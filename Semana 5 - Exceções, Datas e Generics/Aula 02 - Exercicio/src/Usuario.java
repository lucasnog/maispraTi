import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String nome;

    public String getNome() {
        return nome;
    }

    private Set<Livro> livrosEmPosse = new HashSet<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public Set<Livro> getLivrosEmPosse() {
        System.out.println("-----");
        System.out.println("Os livros na posse do " + this.nome + " são:");
        return livrosEmPosse;
    }

    public void pegarEmprestado(Livro livro) throws LimiteLivrosExcedidoException {
        if (livrosEmPosse.size() < 5) {
            this.livrosEmPosse.add(livro);
            livro.setEmprestado();
        } else {
            throw new LimiteLivrosExcedidoException();
        }

    }
}
