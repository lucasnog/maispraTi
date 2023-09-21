
public class Main {
    public static void main(String[] args) {

        int numero = 5000;

        Integer numeroW = numero;
        Integer numeroW2 = numero;

        System.out.println("Usando o ==, é igual? " + (numeroW == numeroW2));
        System.out.println("Usando o equals, é igual? " + (numeroW.equals(numeroW2)));

    }
}