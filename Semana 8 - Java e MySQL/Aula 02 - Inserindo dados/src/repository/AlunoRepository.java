package repository;

import model.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class AlunoRepository implements Crud<Aluno>{
    private Connection conn;
    @Override
    public void create(Aluno aluno) {
        String sql = "INSERT INTO aluno (nome, idade) VALUES (?, ?)";
        this.conn = Conexao.getConexao();

        try (
                PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setString(1, aluno.getNome());
            pstmt.setInt(2, aluno.getIdade());

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                System.out.println("Inserção bem-sucedida!");
            } else {
                System.out.println("Erro ao inserir.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}