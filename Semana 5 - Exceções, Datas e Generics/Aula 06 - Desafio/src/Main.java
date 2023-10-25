
public class Main {
    public static void main(String[] args) throws Exception {
        Reserva reserva1 = new Reserva("001", "Lucas", "21/10/2023", "24/10/2023");
        Reserva reserva2 = new Reserva("002", "Marlon", "11/10/2022", "24/01/2023");
        Reserva reserva3 = new Reserva("003", "Mathe", "21/08/2023", "16/10/2023");
        GerenciadorReservas gerenciadorReservas = new GerenciadorReservas();
        gerenciadorReservas.adicionar(reserva1);
        gerenciadorReservas.adicionar(reserva2);
        gerenciadorReservas.adicionar(reserva3);
        gerenciadorReservas.adicionar(reserva1);
        System.out.println(gerenciadorReservas.buscar("001"));
        System.out.println(gerenciadorReservas.buscar("002"));
        gerenciadorReservas.remover("001");
        System.out.println(gerenciadorReservas.getReservas());


    }
}