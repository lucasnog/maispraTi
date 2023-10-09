public class Carro extends Veiculo implements Promocao {
    public int qtdPortas;

    public Carro(String placa, String marca, String modelo, int ano, double preco) {
        super(placa, marca, modelo, ano, preco);
    }

    public Carro(String placa, String marca, String modelo, int ano, double preco, int qtdPortas) {
        super(placa, marca, modelo, ano, preco);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public String exibirDetalhes() {
        return null;
    }

    @Override
    public String toString() {
        if (this.qtdPortas != 0) {
            return "Carro\n" +
                    "Portas: " + qtdPortas +
                    ", Placa: " + placa +
                    ", Marca: " + marca +
                    ", Modelo: " + modelo +
                    ", Ano: " + ano +
                    ", Preço: " + preco;
        }else{
            return "Carro\n" +
                    "Placa: " + placa +
                    ", Marca: " + marca +
                    ", Modelo: " + modelo +
                    ", Ano: " + ano +
                    ", Preço: " + preco;
        }
    }

    @Override
    public void aplicarDesconto(double valor) {
        System.out.println("------------------------------");
        System.out.println("Tentando dar desconto de " + valor + " para o carro de placa: " + this.placa);
        if (valor > (this.preco*0.1)){
            System.out.println("O valor excede o maximo de 10% permitido para desconto.");
            System.out.println("O valor maximo de desconto permitido para esse carro é: " +this.preco*0.1);
        }else{
            System.out.println("Desconto aplicado com sucesso.");
            this.preco -= valor;
            System.out.println("O novo preço do carro é: " + this.preco);


        }

    }
}
