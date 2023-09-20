public class Main {

    public static void main(String[] args) {

        double nota1, nota2;
        double media;
        final double PESO_NOTA = 0.5;

        nota1 = 10;
        nota2 = 2;

        media = (nota1 * PESO_NOTA) + (nota2 * PESO_NOTA);


        System.out.println("Nota1: " + nota1 + " Nota2: " + nota2 + " -> Média final: " + media);
    }
}
