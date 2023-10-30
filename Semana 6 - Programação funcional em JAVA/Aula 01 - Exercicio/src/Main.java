
public class Main {
    public static void main(String[] args) {

        StringManipulator stringManipulator = new StringManipulator();

        stringManipulator.concatenar.execute("olá", "mundo");

        System.out.println(stringManipulator.concatenar.execute("olá ", "mundo"));
        System.out.println(stringManipulator.primeiraString.execute("olá ", "mundo"));
    }
}