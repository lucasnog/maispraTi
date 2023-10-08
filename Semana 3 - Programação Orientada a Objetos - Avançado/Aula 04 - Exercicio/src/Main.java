
public class Main {
    public static void main(String[] args) {

    Artista artista = new Artista("Lucas");

    Forma circulo = new Circulo("Amarelo");

    System.out.println(artista);

    artista.criarDesenho(circulo);

    }
}