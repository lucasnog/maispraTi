public class LimiteLivrosExcedidoException extends Exception {

    public LimiteLivrosExcedidoException() {
        super("Quantidade máxima de livros(5) por usuário já atingida.");
    }
}
