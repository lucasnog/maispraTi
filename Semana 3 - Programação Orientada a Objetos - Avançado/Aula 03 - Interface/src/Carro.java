public class Carro implements Veiculo, Seguranca {

    @Override
    public void ligar() {
        System.out.println("O carro ligou");
    }

    @Override
    public void acelerar() {
        System.out.println("Vrummm");
    }

    @Override
    public void ligarAlarme() {
        System.out.println("O alarme está ligado");

    }

    @Override
    public void ligarTrava() {
        System.out.println("O carro travou");
    }
}
