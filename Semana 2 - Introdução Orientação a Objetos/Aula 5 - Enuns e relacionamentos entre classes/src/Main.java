
public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor("João", "Ciência");

        Turma turma01 = new Turma(102,20, professor);

        System.out.println(turma01);

    }
}