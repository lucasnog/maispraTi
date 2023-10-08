abstract class Forma implements Desenho {
    protected String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    @Override
    public abstract void desenhar();
}
