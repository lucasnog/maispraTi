public class Aluno {
        String nome;
        Integer matricula;
        Integer qtdFaltas = 0;

        public void faltou(){
            qtdFaltas++;
            System.out.println("O aluno " + nome + " faltou");
        }

        public Aluno(String nome, Integer matricula, Integer qtdFaltas){
            this.nome = nome;
            this.matricula = matricula;
            this.qtdFaltas = qtdFaltas;
        }

        public Aluno (){}
}
