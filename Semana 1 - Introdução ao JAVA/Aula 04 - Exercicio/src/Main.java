
public class Main {
    public static void main(String[] args) {

        System.out.println("Exercicio 1 - If-else");

        int numero = 0;

        if (numero == 0) {
            System.out.println("O número é 0.");
        } else {
            if(numero < 1){
                System.out.println("O número " + numero + " é negativo");
            }else{
            System.out.println("O número " + numero + " é positivo");
        }
        }


        System.out.println("----------------------------");
        System.out.println("Exercicio 2 - Switch-case");

        int opcao = 3;

        switch(opcao){
            case 1:
                System.out.println("Você escolheu a opção 1");
                 break;
            case 2:
                System.out.println("Você escolheu a opção 2");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3");
                break;
            default: System.out.println("Opção inválida.");
                break;
        }


        System.out.println("----------------------------");
        System.out.println("Exercicio 3 - While");

        int decrescente = 10;

        while(decrescente > 0){
            System.out.println(decrescente);
            decrescente--;
        }


        System.out.println("----------------------------");
        System.out.println("Exercicio 4 - Do-while");


        int crescente = 1;

        do{
            System.out.println(crescente);
            crescente++;
        } while (crescente <= 5);


        System.out.println("----------------------------");
        System.out.println("Exercicio 5 - For");


        for(int multiplicador = 1; multiplicador <=10; multiplicador++){
            int resultado = multiplicador * 7;
            System.out.println("7 x "+ multiplicador + " = " +resultado);
        }

    }


    }
