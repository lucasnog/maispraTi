
public class Main {
    private int x;

    public static void main(String[] args) {

       Impressora.imprimir(Impressora.exemplo.toString());
       Impressora.exemplo.setValor("Novo valor");
       Impressora.imprimir(Impressora.exemplo.toString());

    }
}