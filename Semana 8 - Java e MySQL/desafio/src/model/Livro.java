package model;

public class Livro {
    private int id;

    private String titulo;
    private String autor;
    private int anoPub;
    private String status;

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPub=" + anoPub +
                ", status='" + status + '\'' +
                '}';
    }

    public Livro(String titulo, String autor, int anoPub, String status) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = anoPub;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
