package repository;

import model.Curso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public void update(Curso curso) {
        String sql = "UPDATE curso SET professor = ?, materia = ? WHERE id = ?";
        this.conn = Escola.getConexao();

        try (
                PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setString(1, curso.getProfessor());
            pstmt.setString(2, curso.getMateria());
            pstmt.setInt(3, curso.getId());

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                System.out.println("Atualização bem-sucedida!");
            } else {
                System.out.println("Erro ao atualizar.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        Escola.fechaConexao(this.conn);
    }

    @Override
    public void delete(int id) {

        String sql = "DELETE FROM curso WHERE id = " + id;
        this.conn = Escola.getConexao();

        try (
                PreparedStatement pstmt = this.conn.prepareStatement(sql)) {

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                System.out.println("Remoção bem-sucedida!");
            } else {
                System.out.println("Erro ao atualizar.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        Escola.fechaConexao(this.conn);

    }

    @Override
    public List<Curso> readAll() {
        List<Curso> cursos = new ArrayList<>();
        String sql = "SELECT * FROM curso";
        this.conn = Escola.getConexao();

        try (
                PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Curso curso = new Curso();
                curso.setId(rs.getInt("id"));
                curso.setMateria(rs.getString("materia"));
                curso.setProfessor(rs.getString("professor"));

                cursos.add(curso);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        Escola.fechaConexao(this.conn);

        return cursos;
    }

    @Override
    public Curso readById(int id) {
        String sql = "SELECT * FROM curso WHERE id = " + id;
        this.conn = Escola.getConexao();

        try (
                PreparedStatement pstmt = this.conn.prepareStatement(sql)) {

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Curso curso = new Curso();
                curso.setId(rs.getInt("id"));
                curso.setMateria(rs.getString("materia"));
                curso.setProfessor(rs.getString("professor"));
                return curso;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            Escola.fechaConexao(this.conn);
        }

        return null;
    }
}
