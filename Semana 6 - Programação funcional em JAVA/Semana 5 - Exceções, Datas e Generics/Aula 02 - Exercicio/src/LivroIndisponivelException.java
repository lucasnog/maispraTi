public class LivroIndisponivelException extends Exception {

    public LivroIndisponivelException() {
        super("O livro solicitado já está emprestado.");
    }

}
