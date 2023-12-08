import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Artigo {

    private String titulo;
    private LocalDate dataPublicacao;
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Artigo(String titulo, String dataString) {
        this.titulo = titulo;
        this.dataPublicacao = LocalDate.parse(dataString, formatador);
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    @Override
    public String toString() {
        return "Artigo: " + titulo + ", Publicado em: " + dataPublicacao.format(formatador);
    }

}
