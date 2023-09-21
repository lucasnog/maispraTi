import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean continuar = true;
        String resposta ="1";


        do {

            if(resposta.equals("1")){
            System.out.println("Digite o primeiro numero.");
            Double n1 = sc.nextDouble();

            System.out.println("Digite o segundo numero.");
            Double n2 = sc.nextDouble();


            System.out.println("Digite o numero da operação desejada:");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");

            Integer operacao = sc.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println(n1 + n2);
                    break;
                case 2:
                    System.out.println(n1 - n2);
                    break;
                case 3:
                    System.out.println(n1 * n2);
                    break;
                case 4:
                    System.out.println(n1 / n2);
                    break;


            }
        }

            System.out.println("Deseja continuar?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            resposta = sc.next();

            if (resposta.equals("2")) {
                continuar = false;
                System.out.println("Certo! Até mais.");
            } else if (resposta.equals("1")) {
            }else{
                System.out.println("Resposta invalida.");
            }

        }while (continuar);
    }
}