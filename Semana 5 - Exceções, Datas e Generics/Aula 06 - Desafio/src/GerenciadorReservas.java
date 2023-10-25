import java.util.ArrayList;
import java.util.List;

public class GerenciadorReservas implements Repositorio<Reserva>{
    private List<Reserva> reservas = new ArrayList<>();

    public List<Reserva> getReservas() {
        return reservas;
    }


    @Override
    public void adicionar(Reserva reserva) throws ReservaConflitanteException {
        try {
            for (Reserva r : reservas) {
                if (r.getCodigo().equals(reserva.getCodigo())) {
                    throw new ReservaConflitanteException("Código da reserva já existe.");
                }
            }
            reservas.add(reserva);
        } catch (ReservaConflitanteException e) {
            System.out.println("Erro ao adicionar reserva: " + e.getMessage());
        }
    }
    @Override
    public void remover(String reserva) {
        reservas.remove(reserva);
    }

    @Override
    public Reserva buscar(String codigo) {
        for (Reserva reserva : reservas) {
            if (reserva.getCodigo().equals(codigo)){
                return reserva;
            }
        }
        return  null;
    }

}
