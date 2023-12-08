public class Livro {
    private String nome;
    private boolean emprestado;

    public Livro(String nome) {
        this.nome = nome;
        this.emprestado = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado() {
        if (emprestado) {
            this.emprestado = false;
        } else {
            this.emprestado = true;
        }
    }

    @Override
    public String toString() {
        return "Livro\n [Nome: " + nome + " -> Está emprestado? " + isEmprestado() + "]\n";
    }

}
