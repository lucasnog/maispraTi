public class Artista {
    private String nome;
    public Artista(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Artista " + nome;
    }

    public void criarDesenho (Desenho desenho){
        desenho.desenhar();
    }
}
