public class App {
    public static void main(String[] args) throws Exception {
        Livro livro = new Livro("Os Lusiadas", "Luis", "raros");
        Livro livro1 = new Livro("Martin Fierro", "jose", "raros");
        Livro livro2 = new Livro("O profeta", "Gibran", "esoterismo");
        Livro livro3 = new Livro("Duna", "Frank", "ficção");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.addLivro(livro);
        biblioteca.addLivro(livro1);
        biblioteca.addLivro(livro2);
        biblioteca.addLivro(livro3);

        System.out.println(biblioteca.listLivros());
        System.out.println(biblioteca.listarCategorias());
        biblioteca.buscarPorCategoria("raros");
    }
}
