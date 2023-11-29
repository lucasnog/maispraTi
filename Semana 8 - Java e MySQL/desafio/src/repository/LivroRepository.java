package repository;

import model.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroRepository implements Crud<Livro>{

    private Connection conn;

    @Override
    public void create(Livro livro) {
        String sql = "INSERT INTO livro (titulo, autor, anoPub, status ) VALUES (?, ?, ?, ?)";
        this.conn = Biblioteca.getConexao();

        try (
                PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setString(1, livro.getTitulo());
            pstmt.setString(2, livro.getAutor());
            pstmt.setInt(3, livro.getAnoPub());
            pstmt.setString(4, livro.getStatus());


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
    public void update(Livro livro) {
        String sql = "UPDATE livro SET titulo = ?, autor = ?, anoPub = ?, status = ? WHERE id = ?";
        this.conn = Biblioteca.getConexao();

        try (
                PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setString(1, livro.getTitulo());
            pstmt.setString(2, livro.getAutor());
            pstmt.setInt(3, livro.getAnoPub());
            pstmt.setString(4, livro.getStatus());

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                System.out.println("Atualização bem-sucedida!");
            } else {
                System.out.println("Erro ao atualizar.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        Biblioteca.fechaConexao(this.conn);
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM livro WHERE id = " + id;
        this.conn = Biblioteca.getConexao();

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

        Biblioteca.fechaConexao(this.conn);
    }

    @Override
    public List<Livro> readAll() {
        List<Livro> livros = new ArrayList<>();
        String sql = "SELECT * FROM livro";
        this.conn = Biblioteca.getConexao();

        try (
                PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Livro livro = new Livro();
                livro.setId(rs.getInt("id"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setAnoPub(rs.getInt("anoPub"));
                livro.setStatus(rs.getString("status"));

                livros.add(livro);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        Biblioteca.fechaConexao(this.conn);

        return livros;
    }

    @Override
    public Livro readById(int id) {
        String sql = "SELECT * FROM curso WHERE id = " + id;
        this.conn = Biblioteca.getConexao();

        try (
                PreparedStatement pstmt = this.conn.prepareStatement(sql)) {

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Livro livro = new Livro();
                livro.setId(rs.getInt("id"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setAnoPub(rs.getInt("anoPub"));
                livro.setStatus(rs.getString("status"));
                return livro;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            Biblioteca.fechaConexao(this.conn);
        }

        return null;
    }
}


