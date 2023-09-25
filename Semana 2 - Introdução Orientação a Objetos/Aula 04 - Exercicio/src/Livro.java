import java.util.Objects;

public class Livro {
    private String title;
    private String author;
    private Integer publicationYear;

    public Livro(String title, String author, Integer publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }


    public String toString() {
        return "[Livro: " + this.title + " -> Autor: " + this.author + " -> Ano de publicação: " + this.publicationYear +"]";
    }


    public int hashCode() {
        return Objects.hash(this.title, this.author, this.publicationYear);
    }

    public boolean equals(Livro outro) {
        if (this == outro) {
            return true;
        }
        if (outro == null || getClass() != outro.getClass()) {
            return false;
        }
        return Objects.equals(this.title, outro.title) && Objects.equals(this.author, outro.author) && Objects.equals(this.publicationYear, outro.publicationYear);
    }
}
