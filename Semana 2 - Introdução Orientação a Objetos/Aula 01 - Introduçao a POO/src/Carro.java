public class Carro {

    String marca;
    String cor;
    boolean estaLigado;
    Integer qtdCombustivel;
    public void ligar (){
        estaLigado = true;
    }
    public void desligar (){
        estaLigado = false;
    }

    public Integer verQtdCombustivel() {
        return qtdCombustivel;
    }

}

