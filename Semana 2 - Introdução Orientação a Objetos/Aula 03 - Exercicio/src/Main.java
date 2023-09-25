import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer op;
        boolean aux = true;
        Scanner sc = new Scanner(System.in);
        BankAcc acc1 = new BankAcc();


        do {
            System.out.println("Digite o numero da operação desejada:");
            System.out.println("1 - Verificar saldo");
            System.out.println("2 - Deposito");
            System.out.println("3 - Retirar");
            System.out.println("4 - Sair");

            op = sc.nextInt();

            switch(op){
                case 1:
                    System.out.println("Seu saldo é: " + acc1.getBalance() + " reais.");
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja depositar.");
                    acc1.amountD = sc.nextInt();
                    acc1.deposit(acc1.amountD);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja retirar.");
                    acc1.amountW = sc.nextInt();
                    acc1.withdraw(acc1.amountW);
                    break;
                case 4:
                    aux = false;
                    System.out.println("Até logo.");
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente.");
            }


        }while(aux);


    }


}