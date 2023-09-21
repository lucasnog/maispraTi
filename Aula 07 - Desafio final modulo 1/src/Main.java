import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu peso:");
        double peso = sc.nextDouble();

        System.out.println("Digite a sua altura:");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu Índice de Massa Corporal (IMC) é: " + imc);

        //cálculo do peso ideal em função da altura.
        //imc = peso /(altura^2) -> peso = imc * altura^2

        double pesoIdealMax = (24.9 * altura * altura);
        double pesoIdealMin = (18.5 * altura * altura);
        double difIdealMax = peso - pesoIdealMax;
        double difIdealMin = peso - pesoIdealMin;

        System.out.println("Para a sua altura, o peso ideal varia entre " + pesoIdealMin + " e " + pesoIdealMax + " quilogramas.");

        System.out.println("No momento a sua classificação é: ");

        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal.");
        } else {
            if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Peso normal (faixa considerada saudável).");
            } else {
                if (imc >= 25 && imc <= 29.9) {
                    System.out.println("Sobrepeso.");
                } else {
                    if (imc >= 30 && imc <= 34.9) {
                        System.out.println("Obesidade grau 1.");
                    } else {
                        if (imc >= 35 && imc <= 39.9) {
                            System.out.println("Obesidade grau 2.");
                        } else {
                            System.out.println("Obesidade grau 3 (obesidade mórbida).");
                        }
                    }
                }
            }
        }

        if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Parabéns!");
        } else {
            if (difIdealMin > 0) {
                System.out.println("Para atingir o peso ideal, considerando sua altura, é necessário emagrecer: " + difIdealMax + " quilogramas.");

            } else {
                System.out.println("Para atingir o peso ideal, considerando sua altura, é necessário engordar: " + difIdealMin*(-1) + " quilogramas.");
            }
        }
    }
}