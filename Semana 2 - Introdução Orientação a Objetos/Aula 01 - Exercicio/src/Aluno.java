public class Aluno {
    String nome;
    Integer matricula;
    Integer qtdFaltas = 0;

    public void faltou(){
        qtdFaltas++;
    }


}
