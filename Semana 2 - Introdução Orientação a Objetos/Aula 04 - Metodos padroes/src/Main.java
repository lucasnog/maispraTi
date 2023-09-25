
public class Main {
    public static void main(String[] args) {
    Aluno aluno = new Aluno(23215, "lucas");
    Aluno aluno1 = new Aluno(23215, "lucas");

        System.out.println(aluno.equals(aluno1));

        System.out.println(aluno.hashcode());
        System.out.println(aluno1.hashcode());

    }
}