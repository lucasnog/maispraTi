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

    public boolean setTabuleiro(int entrada, String jogador) {
        int i = -1;
        int j = -1;

        switch (entrada) {
            case 1:
                i = 0;
                j = 0;
                break;
            case 2:
                i = 0;
                j = 1;
                break;
            case 3:
                i = 0;
                j = 2;
                break;
            case 4:
                i = 1;
                j = 0;
                break;
            case 5:
                i = 1;
                j = 1;
                break;
            case 6:
                i = 1;
                j = 2;
                break;
            case 7:
                i = 2;
                j = 0;
                break;
            case 8:
                i = 2;
                j = 1;
                break;
            case 9:
                i = 2;
                j = 2;
                break;
            default:
                System.out.println("Opção inválida.");
                return false;
        }

        if (i == -1 || j == -1) {
            return false;
        }

        if (!tabuleiro[i][j].equals("X") && !tabuleiro[i][j].equals("O")) {
            tabuleiro[i][j] = jogador;
            return true;
        } else {
            System.out.println("Campo já foi escolhido.");
            return false;
        }
    }

    public void telaAtual() {

        for (int i = 0; i < tabuleiro.length; i++) {

            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }

            System.out.println();
        }
    }

    public boolean checkGanhador() {

        // Verificação de linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0].equals(tabuleiro[i][1]) && tabuleiro[i][0].equals(tabuleiro[i][2])) {
                return true;
            }
        }

        // Verificação de colunas
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j].equals(tabuleiro[1][j]) && tabuleiro[0][j].equals(tabuleiro[2][j])) {
                return true;
            }
        }

        // Verificação de diagonais
        if (tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[0][0].equals(tabuleiro[2][2])) {
            return true;
        }

        if (tabuleiro[0][2].equals(tabuleiro[1][1]) && tabuleiro[0][2].equals(tabuleiro[2][0])) {
            return true;
        }

        return false;
    }

}
