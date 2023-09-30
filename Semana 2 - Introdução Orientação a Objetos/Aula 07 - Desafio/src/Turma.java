public class Turma {

    private int id;
    private Aluno aluno01, aluno02, aluno03, aluno04, aluno05;

    public Turma(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        System.out.println("------------------------------");
        return "Turma: "+ id + "\n" +
                "Quantidade total de alunos: " + qtdAlunos() + "\n" +
                "Aluno 01: " + aluno01 + "\n" +
                "Aluno 02: " + aluno02 + "\n" +
                "Aluno 03: " + aluno03 + "\n" +
                "Aluno 04: " + aluno04 + "\n" +
                "Aluno 05: " + aluno05 + "\n" +
                "A média da turma é: " + this.getMedia();

    }

    public void addAluno(Aluno aluno){
        System.out.println("------------------------------");
        System.out.println("Tentando cadastraro o aluno: " + aluno.getNome() + " na turma " + this.id + "...");

                if(aluno01 == null){
                    aluno01 = aluno;
                    System.out.println("Aluno cadastrado com sucesso.");
                    System.out.println("No momento a turma tem: " + this.qtdAlunos() + " aluno.");
                }else{
                    if(aluno02 == null){
                        aluno02 = aluno;
                        System.out.println("Aluno cadastrado com sucesso.");
                        System.out.println("No momento a turma tem: " + this.qtdAlunos() + " alunos.");
                    }else {
                        if(aluno03 == null){
                            aluno03 = aluno;
                            System.out.println("Aluno cadastrado com sucesso.");
                            System.out.println("No momento a turma tem: " + this.qtdAlunos() + " alunos.");
                        }else {
                            if(aluno04 == null){
                                aluno04 = aluno;
                                System.out.println("Aluno cadastrado com sucesso.");
                                System.out.println("No momento a turma tem: " + this.qtdAlunos() + " alunos.");
                            }else {
                                if(aluno05 == null){
                                    aluno05 = aluno;
                                    System.out.println("Aluno cadastrado com sucesso.");
                                    System.out.println("No momento a turma tem: " + this.qtdAlunos() + " alunos.");
                                }else{
                                    System.out.println("Aluno "+ aluno.getNome() + " que tentou se cadastrar na turma: " + this.id + ", não foi cadastrado. A turma já está lotada!");
                                }
                            }
                        }
                    }
                }

    }


    public int qtdAlunos(){
        int qtd;

        if(aluno01 == null){
            qtd = 0;
        }else{
            if(aluno02 == null){
                qtd = 1;
            }else {
                if(aluno03 == null){
                    qtd = 2;
                }else {
                    if(aluno04 == null){
                        qtd = 3;
                    }else {
                        if(aluno05 == null){
                            qtd = 4;
                        }else{
                            qtd = 5;
                        }
                    }
                }
            }
        }
        return qtd;
    }

    public double getMedia(){
        double media;

        if(aluno01 == null){
            media = 0;
        }else{
            if(aluno02 == null){
                media = aluno01.getNota();
            }else {
                if(aluno03 == null){
                    media = (aluno01.getNota() + aluno02.getNota())/2;
                }else {
                    if(aluno04 == null){
                        media = (aluno01.getNota() + aluno02.getNota() + aluno03.getNota())/3;
                    }else {
                        if(aluno05 == null){
                            media = (aluno01.getNota() + aluno02.getNota() + aluno03.getNota() + aluno04.getNota())/4;
                        }else{
                            media = (aluno01.getNota() + aluno02.getNota() + aluno03.getNota() + aluno04.getNota()+aluno05.getNota())/5;
                        }
                    }
                }
            }
        }
        return media;

    }
}


