public class App {

    public static void main(String[] args) {
        JogoDaVelha jogo1 = new JogoDaVelha();

        jogo1.telaAtual();
        jogo1.setTabuleiro(0, 0, "X");
        jogo1.setTabuleiro(1, 1, "O");
        System.out.println("---");
        jogo1.telaAtual();
    }
}