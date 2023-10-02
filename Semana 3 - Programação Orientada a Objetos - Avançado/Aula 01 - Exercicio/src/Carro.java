public class Carro extends Veiculo {
    protected int numPortas;

    public Carro (String marca, String modelo, int ano, int numPortas){
        super(marca,modelo,ano);
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return "--- Informações do Carro ---" +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + ano +
                "\nNúmero de portas: " + numPortas+ "\n";
    }

}
