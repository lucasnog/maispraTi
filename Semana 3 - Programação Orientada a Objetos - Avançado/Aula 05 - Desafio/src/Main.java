
public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro("OLA0000", "Ford", "Focus", 2012, 30000, 5);
        Veiculo veiculo2 = new Carro("OLA0001", "Fiat", "Marea", 2022, 10000);
        Veiculo veiculo3 = new Moto("OLA0002", "Fiat", "`Palio`", 2010, 10000, "Disco");
        Veiculo veiculo4 = new Moto("OLA0003", "Vw", "Up", 2012, 20000);
        Veiculo veiculo5 = new Carro("OLA0004", "Vw", "Polo", 2013, 60000);
        Veiculo veiculo6 = new Carro("OLA0005", "Ford", "Focus5", 2012, 10000, 5);


        Revenda revenda = new Revenda();

        revenda.addVeiculo(veiculo1);
        revenda.addVeiculo(veiculo2);
        revenda.addVeiculo(veiculo3);
        revenda.addVeiculo(veiculo4);
        revenda.addVeiculo(veiculo5);
        revenda.addVeiculo(veiculo6);
        revenda.removerVeiculo("OLA0004");
        revenda.addVeiculo(veiculo6);

        revenda.listarVeiculos();

        revenda.addDesconto("OLA0000", 5000);
        revenda.addDesconto("OLA0003", 300);
        revenda.addDesconto("OLA0001", 900);

        revenda.listarVeiculos();

    }
}