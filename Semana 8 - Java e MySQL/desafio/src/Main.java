import model.Livro;
import repository.LivroRepository;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LivroRepository livroRepository = new LivroRepository();

        Livro livroNovo = new Livro("teste", "teste",2000, "ok");

        livroRepository.create(livroNovo);
    }
}