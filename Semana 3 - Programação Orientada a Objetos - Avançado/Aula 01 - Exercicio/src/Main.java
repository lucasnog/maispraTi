
public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Toyota","Corolla",2021);
        Carro carro = new Carro("Toyota","Corolla",2023, 4);
        Moto moto = new Moto("Honda","CB500",2021, 500);


        System.out.println(veiculo);
        System.out.println(moto);
        System.out.println(carro);

    }
}