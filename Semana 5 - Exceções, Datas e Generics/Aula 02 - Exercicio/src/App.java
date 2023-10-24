public class App {
    public static void main(String[] args) throws Exception {

        try {
            Biblioteca biblioteca = new Biblioteca();
            Usuario user1 = new Usuario("Lucas");
            Livro livro1 = new Livro("Ao Farol");
            Livro livro3 = new Livro("A casa dos espíritos");
            Livro livro4 = new Livro("Memórias póstumas de Brás Cubas");
            Livro livro5 = new Livro("Cem Anos de Solidão");
            Livro livro6 = new Livro("O Rei Lear");
            Livro livro2 = new Livro("Moby Dick");
            biblioteca.adicionarLivro(livro1);
            biblioteca.adicionarLivro(livro2);
            biblioteca.adicionarLivro(livro3);
            biblioteca.adicionarLivro(livro4);
            biblioteca.adicionarLivro(livro5);
            biblioteca.adicionarLivro(livro6);
            biblioteca.emprestarLivro(livro1, user1);
            biblioteca.emprestarLivro(livro1, user1);
            biblioteca.emprestarLivro(livro2, user1);
            biblioteca.emprestarLivro(livro3, user1);
            biblioteca.emprestarLivro(livro4, user1);
            biblioteca.emprestarLivro(livro5, user1);
            biblioteca.emprestarLivro(livro6, user1);
            System.out.println(user1.getLivrosEmPosse());
            System.out.println(biblioteca.getAcervoDeLivros());
        } catch (LimiteLivrosExcedidoException e) {
            System.out.println(e.getMessage());
        } catch (LivroIndisponivelException e) {
            System.out.println(e.getMessage());
        }
    }
}