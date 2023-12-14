public interface Repositorio<T> {

    public void adicionar(T reserva) throws ReservaConflitanteException;
    public void remover (String reserva);
    public T buscar(String codigo);

}
