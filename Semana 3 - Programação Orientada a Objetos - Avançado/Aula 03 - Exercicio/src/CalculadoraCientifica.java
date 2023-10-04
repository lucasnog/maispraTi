public class CalculadoraCientifica implements Calculadora {

    @Override
    public double somar(double a, double b) {
        return a+b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a*b;
    }

    @Override
    public double dividir(double a, double b) {
        return a/b;
    }

    public double raizQuadrada(double numero){
        return Math.sqrt(numero);
    }
    public double potencia(double base, double expoente){
        return Math.pow(base, expoente);
    }
}
