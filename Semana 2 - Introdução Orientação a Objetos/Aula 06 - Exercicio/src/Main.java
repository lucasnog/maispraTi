
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int aux = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        double num1 = sc.nextDouble();

        do{
            System.out.println("Digite o proximo numero:");
            double num2 = sc.nextDouble();

            System.out.println("Qual operação deseja fazer?");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - divisão");
            System.out.println("4 - multiplicação");

            int op = sc.nextInt();

            switch (op){

                case 1:
                    System.out.println("Resultado: " + Calculadora.soma(num1,num2));
                    num1 = Calculadora.soma(num1,num2);
                    break;
                case 2:
                    System.out.println("Resultado: " + Calculadora.sub(num1,num2));
                    num1 = Calculadora.sub(num1,num2);
                    break;
                case 3:
                    if(num2 != 0){
                        System.out.println("Resultado: " + Calculadora.div(num1,num2));
                        num1 = Calculadora.div(num1,num2);
                    }else{
                        System.out.println("Erro, o numero precisa ser diferente de 0");
                    }
                    break;
                case 4:
                    System.out.println("Resultado: " + Calculadora.multi(num1,num2));
                    num1 = Calculadora.multi(num1,num2);
                    break;
            }
            for(boolean auxSair = true; auxSair;) {

                System.out.println("Deseja continuar ");

                System.out.println("1 - sim");
                System.out.println("2 - não");
                aux = sc.nextInt();
                if (aux == 1) {
                    System.out.println("Parcial: " + num1);
                    auxSair = false;
                } else if (aux == 2) {
                    auxSair = false;
                    System.out.println("Até logo");
                }else {
                    System.out.println("Opção invalida!");
                }
            }
        }while(aux != 2);
    }
}