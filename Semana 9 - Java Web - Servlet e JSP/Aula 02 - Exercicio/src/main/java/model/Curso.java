package model;

public class Curso {
    private int id;

    private String professor;
    private String materia;

    public Curso(String professor, String materia) {
        this.professor = professor;
        this.materia = materia;
    }
    public Curso() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
