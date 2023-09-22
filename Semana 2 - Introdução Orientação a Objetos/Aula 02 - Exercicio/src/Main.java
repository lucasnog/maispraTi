    public class Main {
        public static void main(String[] args) {
            Aluno aluno = new Aluno();
            aluno.nome = "Lucas";
            aluno.matricula = 0001;

            System.out.println("Nome do aluno: " + aluno.nome);
            System.out.println("Matricula: " + aluno.matricula);
            System.out.println("Faltas: " + aluno.qtdFaltas);

            aluno.faltou();
            System.out.println("Faltas: " + aluno.qtdFaltas);

            Aluno aluno2 = new Aluno("Teste", 20221351, 0);
            aluno2.faltou();
            aluno2.faltou();
            System.out.println("Nome do aluno: " + aluno2.nome);
            System.out.println("Matricula: " + aluno2.matricula);
            System.out.println("Faltas: " + aluno2.qtdFaltas);
            System.out.println("Faltas: " + aluno2.qtdFaltas);

        }
    }

