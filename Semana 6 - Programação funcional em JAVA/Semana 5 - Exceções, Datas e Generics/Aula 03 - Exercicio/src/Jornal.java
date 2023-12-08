import java.util.Set;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Jornal {
    final static Set<Artigo> listaDeArtigos = new HashSet<>();
    static DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static Set<Artigo> getListadeartigos() {
        System.out.println("-----");
        System.out.println("-Artigos do Jornal-");
        return listaDeArtigos;
    }

    public static void addArtigo(Artigo artigo) {
        System.out.println("-----");
        System.out.println("Artigo: " + artigo.getTitulo() + " foi adicionado ao Jornal com sucesso.");
        listaDeArtigos.add(artigo);
    }

    public static List<Artigo> buscarPorData(String de, String ate) {
        List<Artigo> artigosNoIntervalo = new ArrayList<>();
        LocalDate dataDe = LocalDate.parse(de, formatador);
        LocalDate dataAte = LocalDate.parse(ate, formatador);
        for (Artigo artigo : listaDeArtigos) {
            LocalDate dataArtigo = artigo.getDataPublicacao();
            if (dataArtigo.isAfter(dataDe)
                    && dataArtigo.isBefore(dataAte)) {
                artigosNoIntervalo.add(artigo);
            }
        }
        System.out.println("-----");
        System.out.println("Os artigos publicados de: " + de + " até : " + ate + " são:");
        return artigosNoIntervalo;

    }
}
