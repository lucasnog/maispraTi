public class Carro {

    private String marca;
    private String modelo;
    private String cor;
    private boolean estaLigado;
    private Integer qtdCombustivel;

    //Construtor
    public Carro(String marca, String modelo, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    //Sobrecarga
    public Carro(){}

    public boolean setLigar (){

        if(estaLigado){
            return this.estaLigado = false;
        }else{
            return this.estaLigado = true;
        }
    }

    public boolean getEstaLigado() {
        return this.estaLigado;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return this.modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return this.marca;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return this.cor;
    }

}
