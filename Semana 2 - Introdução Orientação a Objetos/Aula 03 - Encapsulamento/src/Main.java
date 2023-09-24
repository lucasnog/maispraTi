
public class Main {
    public static void main(String[] args) {
Carro carro = new Carro();
carro.setMarca("Hyundai");
carro.setLigar();
System.out.println(carro.getEstaLigado());
System.out.println(carro.getCor());
System.out.println(carro.getMarca());
System.out.println(carro.getModelo());

        System.out.println("----------");

Carro carro1 = new Carro("VW","up!","branco");
System.out.println(carro1.getEstaLigado());
System.out.println(carro1.getCor());
System.out.println(carro1.getMarca());
System.out.println(carro1.getModelo());

    }
}