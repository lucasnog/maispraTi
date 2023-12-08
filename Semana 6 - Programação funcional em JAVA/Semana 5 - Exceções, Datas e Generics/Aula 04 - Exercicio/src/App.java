public class App {
    public static void main(String[] args) throws Exception {

        Eletronico lojaEletronico = new Eletronico();
        Alimento lojaAlimento = new Alimento();
        Roupa lojaRoupa = new Roupa();

        lojaEletronico.addItem("Computador");
        lojaEletronico.addItem("Tablet");
        lojaEletronico.addItem("Celular");
        System.out.println(lojaEletronico.getItensDaLoja());

        lojaAlimento.addItem("Pão");
        lojaAlimento.addItem("Milho");
        lojaAlimento.addItem("Soja");
        System.out.println(lojaAlimento.getItensDaLoja());

        lojaRoupa.addItem("Camisa");
        lojaRoupa.addItem("Calça");
        lojaRoupa.addItem("Meia");
        System.out.println(lojaRoupa.getItensDaLoja());
    }
}
