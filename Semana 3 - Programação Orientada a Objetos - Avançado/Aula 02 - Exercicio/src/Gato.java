public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    String som() {
        return "miau";
    }

    @Override
    public String toString() {
        return  "Nome: " + nome +
                ", Idade: " + idade + " anos" +
                ", Som: " + som();
    }
}
