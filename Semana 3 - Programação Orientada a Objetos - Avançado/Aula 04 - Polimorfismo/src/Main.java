
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();

        cachorro.emitirSom();
        cachorro.passear();

        Animal cachorro1 = new Cachorro();

        cachorro1.emitirSom();
        //cachorro1.passear() não está acessivel, pois usou o polimorfismo e não pegou o metodo filho.

    }
}