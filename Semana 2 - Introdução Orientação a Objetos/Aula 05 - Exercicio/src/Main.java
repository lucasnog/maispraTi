
public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Sabão", 15, CategoriaProduto.LIMPEZA);
        Produto produto2 = new Produto("Celular", 18, CategoriaProduto.ELETRONICO);
        Produto produto3 = new Produto("Camiseta", 130, CategoriaProduto.VESTUARIO);
        Produto produto4 = new Produto("Batata Frita", 25, CategoriaProduto.ALIMENTO);

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);

    }
}