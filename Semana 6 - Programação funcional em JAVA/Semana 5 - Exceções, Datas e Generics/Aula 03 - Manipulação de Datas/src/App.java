import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Date data = new Date();
        System.out.println(data);

        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.JULY, 15);
        System.out.println(cal);

        LocalDate localData = LocalDate.of(2023, 10, 12);
        System.out.println(localData);

        LocalDate hoje = LocalDate.now(); // Pega a data atual
        System.out.println(hoje);
        LocalDate dataEspecifica = LocalDate.of(2023, 7, 15); // Define uma data específica
        System.out.println(dataEspecifica.format(formatador));

        Scanner sc = new Scanner(System.in);
        String dataString = sc.next();
        LocalDate dataDaString = LocalDate.parse(dataString, formatador);
        System.out.println(dataDaString);
    }
}
