
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Auau");
        Animal animal = new Animal("arara");

        animal.comunicar();
        cachorro.comunicar();
        cachorro.brincar();
    }
}