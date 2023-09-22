public class Carro {

    String marca;
    String modelo;
    String cor;
    boolean estaLigado;
    Integer qtdCombustivel;
    public void ligar (){
        this.estaLigado = true;
    }
    public void desligar (){
        this.estaLigado = false;
    }

    public Integer verQtdCombustivel() {
        return this.qtdCombustivel;
    }

    //Construtor
    public Carro(String marca, String modelo, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    //Sobrecarga
    public Carro(){}

}

