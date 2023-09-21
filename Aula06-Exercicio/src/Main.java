import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean continuar = true;
        String resposta = "sim";


        do {

            if(resposta.equals("sim")){
            System.out.println("Digite o primeiro numero.");
            Integer n1 = sc.nextInt();

            System.out.println("Digite o segundo numero.");
            Integer n2 = sc.nextInt();


            System.out.println("Digite o numero da operação desejada. (1 - soma, 2 - subtração,  3 - multiplicação ou  4 - divisão)");
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

            System.out.println("Deseja continuar? (sim/não)");
            resposta = sc.next();

            if (resposta.equals("não")) {
                continuar = false;
                System.out.println("Certo! Até mais.");
            } else if (resposta.equals("sim")) {
            }else{
                System.out.println("Resposta invalida.");
            }

        }while (continuar);
    }
}