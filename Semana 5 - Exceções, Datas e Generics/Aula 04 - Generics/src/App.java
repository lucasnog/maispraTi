public class App {
    public static void main(String[] args) throws Exception {
        Caixa<String> stringCaixa = new Caixa<>();
        stringCaixa.armazenar("Alou!");
        System.out.println(stringCaixa.obter());

        ComparadorString teste = new ComparadorString();
        System.out.println(teste.comparar("null", "alou"));

        ComparadorInt teste1 = new ComparadorInt();
        System.out.println(teste1.comparar(5, 1));
        System.out.println(teste1.comparar(5, 5));
        System.out.println(teste1.comparar(1, 5));

    }
}
