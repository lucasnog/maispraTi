import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Curso {
    @Override
    public String toString() {
        return "-----------\nCurso '" + nome + "' -> Professor: " + professor + "\nDisciplinas:" + disciplinas
                + ", Alunos:" + aluno + "\n-----------";
    }

    private String nome;
    private String professor;
    private List<String> disciplinas = new ArrayList<>();
    private Map<Integer, String> aluno = new HashMap<>();

    public Curso(String nome, String professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public void addDiscplina(String nome) {
        if (disciplinas.contains(nome)) {
            System.out.println("Disciplina já existente.");
        } else {
            disciplinas.add(nome);
            System.out.println("Disciplina adicionada com sucesso.");
        }
    }

    public void delDiscplina(String nome) {
        if (disciplinas.contains(nome)) {
            disciplinas.remove(nome);
            System.out.println("A disciplina '" + nome + "' foi removida com sucesso.");
        } else {
            System.out.println("Disciplina não existe.");
        }
    }

    public void addAluno(Integer cpf, String nome) {
        if (aluno.containsKey(cpf)) {
            System.out.println("Esse aluno já está cadastrado.");
        } else {
            aluno.put(cpf, nome);
            System.out.println("Aluno: " + nome + " cadastrado com sucesso.");
        }
    }

    public void delAluno(Integer cpf) {
        if (aluno.containsKey(cpf)) {
            System.out.println("Aluno: " + aluno.get(cpf) + " foi deletado com sucesso.");
            aluno.remove(cpf);

        } else {
            System.out.println("Esse aluno já está cadastrado.");
        }
    }

    public void checkAluno(Integer cpf) {
        if (aluno.containsKey(cpf)) {
            System.out.println(
                    "O CPF foi encontrado no nosso sistema e pertence ao aluno " + aluno.get(cpf) + ".");
        } else {
            System.out.println("Aluno não encontrado no nosso sistema.");
        }
    }

}
