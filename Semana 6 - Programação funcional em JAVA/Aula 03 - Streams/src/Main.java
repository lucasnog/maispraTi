
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        Stream<Integer> stream = lista.stream().filter(numero -> numero % 2 == 0);
        System.out.println(stream.toList());


        Stream<String> transformado = Stream.of("a", "b", "c").map(letra -> letra.toUpperCase());
        System.out.println(transformado.toList());

        Stream.of("a", "b", "c").forEach(letra -> System.out.println(letra));

        Optional<Integer> soma = Stream.of(1, 2, 3, 4, 5).reduce(((a,b)-> a+b));
        System.out.println(soma.get());



    }
}