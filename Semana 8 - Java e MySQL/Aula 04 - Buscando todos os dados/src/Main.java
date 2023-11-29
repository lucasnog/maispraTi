import model.Aluno;
import repository.AlunoRepository;
import repository.Conexao;

import java.sql.Connection;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        AlunoRepository alunoRepo = new AlunoRepository();

        // Exemplo de criação de um objeto Aluno
        Aluno novoAluno = new Aluno();
        novoAluno.setId(1);
        novoAluno.setNome("Lucas");
        novoAluno.setIdade(30);

       alunoRepo.create(novoAluno);
        Aluno novoAluno1 = new Aluno();
        novoAluno1.setId(1);
        novoAluno1.setNome("Marlon");
        novoAluno1.setIdade(26);

        alunoRepo.create(novoAluno1);
        Aluno novoAluno2 = new Aluno();
        novoAluno2.setId(1);
        novoAluno2.setNome("MaisPraTi");
        novoAluno2.setIdade(10);

        alunoRepo.create(novoAluno2);
        List<Aluno> todosAlunos = alunoRepo.readAll();
        todosAlunos.forEach(System.out::println);



    }
}