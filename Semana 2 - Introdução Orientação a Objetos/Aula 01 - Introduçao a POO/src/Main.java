
public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "honda";
        carro.cor = "azul";
        carro.estaLigado = false;
        carro.qtdCombustivel = 50;

        System.out.println(carro.estaLigado);

        carro.ligar();

        System.out.println(carro.estaLigado);


    }
}