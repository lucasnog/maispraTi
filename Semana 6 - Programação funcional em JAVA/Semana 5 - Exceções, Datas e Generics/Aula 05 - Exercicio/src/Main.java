
public class Main {
    public static void main(String[] args) {

        Comparar comparar = new Comparar();
        System.out.println(comparar.compararNumeros(5,10));
        System.out.println(comparar.compararNumeros(5.2,10.6));
        System.out.println(comparar.compararNumeros(5,10.2));
        System.out.println(comparar.compararNumeros(5,1.13));

    }
}
