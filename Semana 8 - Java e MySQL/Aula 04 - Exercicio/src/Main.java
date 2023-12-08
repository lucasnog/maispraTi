import model.Curso;
import repository.CursoRepository;
import repository.Escola;

import java.sql.Connection;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CursoRepository cursoRepository = new CursoRepository();
        Curso curso = new Curso("Teste","Teste");
        curso.g
        cursoRepository.create(curso);


    }
}