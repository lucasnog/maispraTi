public class JogoDaVelha {

    String[][] tabuleiro = new String[3][3];

    public JogoDaVelha() {

        tabuleiro[0][0] = "1";
        tabuleiro[0][1] = "2";
        tabuleiro[0][2] = "3";

        tabuleiro[1][0] = "4";
        tabuleiro[1][1] = "5";
        tabuleiro[1][2] = "6";

        tabuleiro[2][0] = "7";
        tabuleiro[2][1] = "8";
        tabuleiro[2][2] = "9";

    }

    public void setTabuleiro(int linha, int coluna, String valor) {
        tabuleiro[linha][coluna] = valor;
    }

    public void telaAtual() {

        for (int i = 0; i < tabuleiro.length; i++) {

            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }

            System.out.println();
        }
    }
}
