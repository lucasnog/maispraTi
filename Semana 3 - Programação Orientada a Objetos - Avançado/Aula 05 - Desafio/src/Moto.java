public class Moto extends Veiculo implements Promocao{
    public String tipoFreio;

    public Moto(String placa, String marca, String modelo, int ano, double preco) {
        super(placa, marca, modelo, ano, preco);
    }
    public Moto(String placa, String marca, String modelo, int ano, double preco, String tipoFreio) {
        super(placa, marca, modelo, ano, preco);
        this.tipoFreio = tipoFreio;
    }

    @Override
    public String exibirDetalhes() {
        return null;
    }

    @Override
    public String toString() {
        if(tipoFreio != null){
            return "Moto\n" +
                    "Tipo de freio: " + tipoFreio +
                    ", Placa: " + placa +
                    ", Marca: " + marca +
                    ", Modelo: " + modelo +
                    ", Ano: " + ano +
                    ", Preço: " + preco;
        }else{
            return "Moto\n" +
                    "Placa: " + placa +
                    ", Marca: " + marca +
                    ", Modelo: " + modelo +
                    ", Ano: " + ano +
                    ", Preço: " + preco;
        }
    }

    @Override
    public void aplicarDesconto(double valor) {
        System.out.println("Tentando dar desconto de " + valor + " para a moto de placa: " + this.placa);
        if (valor > (this.preco*0.05)){
            System.out.println("O valor excede o maximo de 5% permitido para desconto.");
            System.out.println("O valor maximo de desconto permitido para essa moto é:" +this.preco*0.1);
            System.out.println("------------------------------");

        }else{
            System.out.println("Desconto aplicado com sucesso.");
            this.preco -= valor;
            System.out.println("O novo preço do veiculo é: " + this.preco);
            System.out.println("------------------------------");

        }



    }
}
