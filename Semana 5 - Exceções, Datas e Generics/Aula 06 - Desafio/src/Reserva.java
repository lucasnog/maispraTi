import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private String codigo;
    private String cliente;
    private String dataEntrada;
    private String dataSaida;
    DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public int diasReservados(String codigo){

        LocalDate dataEntradaLocal = LocalDate.parse(dataEntrada, formatData);
        LocalDate dataSaidaLocal = LocalDate.parse(dataSaida, formatData);

        //                                                 |
        //       ------------------------------            |
        // **** essa parte eu olhei no chatgpt kkk *****  \ /
        //       ------------------------------            v

        long dias = ChronoUnit.DAYS.between(dataEntradaLocal, dataEntradaLocal);

        return (int) (dias + 1);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Reserva(String codigo, String cliente, String dataEntrada, String dataSaida) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codigo='" + codigo + '\'' +
                ", cliente='" + cliente + '\'' +
                ", dataEntrada='" + dataEntrada + '\'' +
                ", dataSaida='" + dataSaida + '\'' +
                '}';
    }
}
