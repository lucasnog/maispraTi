package repository;

import model.Curso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CursoRepository implements Crud<Curso>{

    private Connection conn;
    @Override
    public void create(Curso curso) {
        String sql = "INSERT INTO curso (professor, materia) VALUES (?, ?)";
        this.conn = Escola.getConexao();

        try (
                PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setString(1, curso.getProfessor());
            pstmt.setString(2, curso.getMateria());

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
