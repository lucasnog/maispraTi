public class Animal {

    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void comunicar() {
        System.out.println("O animal está emitindo um som.");
    }
}
