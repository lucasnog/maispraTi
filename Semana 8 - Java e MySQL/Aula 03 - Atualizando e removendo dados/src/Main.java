import model.Aluno;
import repository.AlunoRepository;
import repository.Conexao;

import java.sql.Connection;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        AlunoRepository alunoRepo = new AlunoRepository();

        // Exemplo de criação de um objeto Aluno
        Aluno alunoAtualizado = new Aluno();
        alunoAtualizado.setId(1);
        alunoAtualizado.setNome("Lucas");
        alunoAtualizado.setIdade(30);

        alunoRepo.update(alunoAtualizado);
        alunoRepo.delete(1);
    }
}