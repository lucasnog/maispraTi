import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jogador = "X";
        int jogadas = 0;
        boolean continuar = true;
        JogoDaVelha jogo1 = new JogoDaVelha();

        do {
            jogo1.telaAtual();
            System.out.println("Agora é a vez do " + jogador + " qual posição deseja marcar?");
            int entrada = sc.nextInt();

            if (jogo1.setTabuleiro(entrada, jogador)) {
                jogadas++;
                if (jogo1.checkGanhador()) {
                    System.out.println("O jogador " + jogador + " ganhou!");
                    break;
                }

                jogador = (jogador.equals("X")) ? "O" : "X";
            }

            if (jogadas == 9) {
                System.out.println("Deu velha!!");
                continuar = false;
            }
        } while (continuar);

    }
}