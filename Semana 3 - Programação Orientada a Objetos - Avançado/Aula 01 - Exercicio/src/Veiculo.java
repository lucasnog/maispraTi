public class Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String toString() {
        return "--- Informações do Veículo ---" +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + ano+ "\n";
    }
}
