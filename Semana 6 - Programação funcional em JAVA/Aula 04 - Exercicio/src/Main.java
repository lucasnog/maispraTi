
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Dada uma lista de nomes, crie um mapa onde
        // a chave é o nome e o valor é o comprimento desse nome.

        Map<String, Integer> nomesTamanho = Stream.of("Ana", "Roberto", "Camila")
                .collect(Collectors.toMap(Function.identity(),f->f.length()));

        System.out.println(nomesTamanho);

       // Dada uma lista de números, agrupe os números por paridade (ímpar e par).

        Map<String, List<Integer>> grupoPorParidade = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.groupingBy(
                        numero -> numero % 2 == 0 ? "PAR" : "IMPAR"
                ));


        System.out.println(grupoPorParidade);

        //A partir de uma lista de palavras, retorne um stream de palavras únicas e em ordem alfabética.

        List<String> repetidas = Arrays.asList("maçã", "banana", "maçã", "laranja", "banana");
        Stream<String> ordenado = repetidas.stream().distinct().sorted();
        System.out.println(ordenado.toList());

    }
}