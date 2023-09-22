
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

    }
}