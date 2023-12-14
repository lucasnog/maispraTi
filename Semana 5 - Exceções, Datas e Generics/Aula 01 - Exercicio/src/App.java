import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            String numberStr = "123a";
            int number = Integer.parseInt(numberStr);
            System.out.println("Número: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Não é possivel converter letras em numeros.");
        }

        try {
            Scanner sc = null;
            sc.nextInt();
        } catch (NullPointerException e) {
            System.out.println("O objeto está nulo, defina um valor");
        }
    }
}
