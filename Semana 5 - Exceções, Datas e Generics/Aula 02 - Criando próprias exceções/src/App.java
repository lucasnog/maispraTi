public class App {
    public static void main(String[] args) throws Exception {
        Turma turma = new Turma();

        // turma.obterMediaDaTurma();

        // turma.adicionarAluno("Lucas", 9.1, 10);

        try {

            turma.adicionarAluno("Lucas", 8.0, 10);
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }

        try {
            turma.obterMediaDaTurma();
        } catch (DivisaoPorZeroException e) {
            System.out.println(e.getMessage());
        }

    }
}
