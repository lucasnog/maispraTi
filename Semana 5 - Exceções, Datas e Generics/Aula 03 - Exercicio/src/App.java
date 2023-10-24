public class App {
    public static void main(String[] args) throws Exception {
        Artigo artigo1 = new Artigo("Misterios Antigos", "22/02/2020");
        Artigo artigo2 = new Artigo("Aventuras Subterraneas", "22/02/2019");
        Artigo artigo3 = new Artigo("Segredos Cosmicos", "22/02/2023");
        Artigo artigo4 = new Artigo("Historias Assombradas", "22/02/2021");
        Artigo artigo5 = new Artigo("Descobertas Perdidas", "22/02/2022");
        Artigo artigo6 = new Artigo("Viagens Temporais", "22/02/2010");
        Artigo artigo7 = new Artigo("Conspiracoes Misticas", "22/02/2013");
        Jornal.addArtigo(artigo1);
        Jornal.addArtigo(artigo2);
        Jornal.addArtigo(artigo3);
        Jornal.addArtigo(artigo4);
        Jornal.addArtigo(artigo5);
        Jornal.addArtigo(artigo6);
        Jornal.addArtigo(artigo7);

        System.out.println(Jornal.getListadeartigos());
        System.out.println(Jornal.buscarPorData("22/02/2021", "24/10/2023"));
    }
}
