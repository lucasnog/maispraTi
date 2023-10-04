
public class Main {
    public static void main(String[] args) {
        CalculadoraCientifica calcCientifica = new CalculadoraCientifica();
        CalculadoraSimples calcSimples = new CalculadoraSimples();

        System.out.println("---Calculadora Cientifica---");
        System.out.println(calcCientifica.potencia(2, 2));
        System.out.println(calcCientifica.potencia(5, 3));
        System.out.println(calcCientifica.raizQuadrada(9));

        System.out.println("---Calculadora simples---");
        System.out.println(calcSimples.somar(2,3));
        System.out.println(calcSimples.subtrair(2,3));
        System.out.println(calcSimples.multiplicar(2,3));
        System.out.println(calcSimples.dividir(2,3));





    }
}