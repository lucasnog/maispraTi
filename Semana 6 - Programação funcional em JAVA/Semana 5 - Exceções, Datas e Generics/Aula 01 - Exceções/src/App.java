public class App {
    public static void main(String[] args) throws Exception {

        // EXEMPLO 1
        // int num1 = 10;
        // int num2 = 0;

        // int result = num1 / num2;

        // try {
        // int result = num1 / num2;
        // System.out.println("O resultado é: " + result);
        // } catch (ArithmeticException e) {
        // System.out.println("Não é possível dividir por zero!");
        // }

        // EXEMPLO 2
        int[] numbers = { 1, 2, 3 };
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arruma esse indice ai irmão..");
        }

        System.out.println("To be continued..");
    }
}
