public class Circulo extends Forma {

    private int raio;
    public Circulo(String cor, int raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio:" + raio +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}
