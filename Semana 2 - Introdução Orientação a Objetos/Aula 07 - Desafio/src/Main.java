
public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Lucas",30,"Java202301", 8);
        Aluno aluno2 = new Aluno("Maria",15,"Java202302", 6);
        Aluno aluno3 = new Aluno("Pedro",35,"Java202303", 10);
        Aluno aluno4 = new Aluno("Jose",31,"Java202304", 9);
        Aluno aluno5 = new Aluno("Cesar",20,"Java202305", 5);
        Aluno aluno6 = new Aluno("Paulo",25,"Java202306", 4);
        Aluno aluno7 = new Aluno("Jorge",30,"Java202307", 2);
        Aluno aluno8 = new Aluno("Mateus",60,"Java202308", 9);

        Turma turma01 = new Turma(20230001);
        Turma turma02 = new Turma(20230002);

        turma01.addAluno(aluno1);
        turma01.addAluno(aluno2);
        turma01.addAluno(aluno3);
        turma01.addAluno(aluno4);
        turma01.addAluno(aluno5);
        turma01.addAluno(aluno6);


        turma02.addAluno(aluno6);
        turma02.addAluno(aluno7);
        turma02.addAluno(aluno8);



        System.out.println(turma01);
        System.out.println(turma02);


    }
}