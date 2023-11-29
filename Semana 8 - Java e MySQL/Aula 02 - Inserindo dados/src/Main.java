import model.Aluno;
import repository.AlunoRepository;
import repository.Conexao;

import java.sql.Connection;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        AlunoRepository alunoRepo = new AlunoRepository();

        // Exemplo de criação de um objeto Aluno
        Aluno novoAluno = new Aluno();
        novoAluno.setNome("Maria Rosa");
        novoAluno.setIdade(22);

        alunoRepo.create(novoAluno);
    }
}