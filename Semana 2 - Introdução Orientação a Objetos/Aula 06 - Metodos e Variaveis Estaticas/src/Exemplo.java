public class Exemplo {

    private String valor = "valor qualquer";

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Exemplo{" +
                "valor='" + valor + '\'' +
                '}';
    }
}
