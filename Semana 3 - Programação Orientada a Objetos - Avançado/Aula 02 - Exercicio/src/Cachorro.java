public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    String som() {
        return "au au";
    }

    @Override
    public String toString() {
        return  "Nome: " + nome +
                ", Idade: " + idade + " anos" +
                ", Som: " + som();
    }
}
