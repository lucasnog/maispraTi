public class Moto extends Veiculo{

    public int cilindradas;
    public Moto (String marca, String modelo, int ano, int cilindradas){
        super(marca,modelo,ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "--- Informações da Moto ---" +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + ano +
                "\nCilindradas: " + cilindradas + "\n";
    }
}
