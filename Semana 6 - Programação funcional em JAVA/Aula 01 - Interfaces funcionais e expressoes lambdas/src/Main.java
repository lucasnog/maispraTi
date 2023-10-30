import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Calculadora soma = (a, b) -> a + b;
        Calculadora multiplicacao = (a, b) -> a * b;

        System.out.println(multiplicacao.op(2, 3));
        System.out.println(soma.op(2, 3));
    }
    // () -> System.out.println("Olá mundo!");
//    public void teste() {
//        System.out.println("Olá, mundo!");
//    }
    // (s) -> System.out.println(s)
//    public void teste(Object s) {
//        System.out.println(s);
//    }

    //(a,b) -> a+b;
//    public double teste(Number a, Number b) {
//        return a.doubleValue() + b.doubleValue();
//    }
    }
