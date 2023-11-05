import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //exemplo 1 - Referência a um método estático
        // Expressão Lambda
        Function<Integer, String> lambdaToString = i -> String.valueOf(i);

        // Método de Referência
        Function<Integer, String> methodReferenceToString = String::valueOf;

        System.out.println(lambdaToString.apply(1000));
        System.out.println(methodReferenceToString.apply(1000));

        //exemplo 2 - Referência a um método de instância

        List <String> palavras = Arrays.asList("maçã", "banana", "acerola","uva");

        // Expressão Lambda
        palavras.forEach(s -> System.out.println(s));

        // Método de Referência
        palavras.forEach(System.out::println);

        //exemplo 3 - Referência a um método de instância de um objeto particular

        String stringExemplo = "Hello";
        // Expressão Lambda
        Predicate<String> lambda = s -> stringExemplo.startsWith(s);

        System.out.println(lambda.test("H"));
        // Método de Referência
        Predicate<String> methodReference = stringExemplo::startsWith;
        System.out.println(methodReference.test("H"));

        //exemplo 4 - Referência a um método de instância de um objeto particular

        // Expressão Lambda

//        Function<String, Pessoa> lambdaConstructor = nome -> new Pessoa(nome);

        // Método de Referência
//        Function<String, Pessoa> referenceConstructor = Pessoa::new;


        // streams
        //1 - collect(Collector)

        List<Integer> inteiros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> streamInteiros = inteiros.stream();
        Stream<String> streamStrings = streamInteiros.map(String::valueOf);
        List<String> stringsInt = streamStrings.collect(Collectors.toList());
        System.out.println(stringsInt);

        List<String> lista = Stream.of(1, 2, 3).map(String::valueOf).collect(Collectors.toList());
        System.out.println(lista);

        //2  Collectors.toMap(Function<T, K>, Function<T, U>)

        Map<String, Integer> mapa = Stream.of("a", "bc", "def")
                .collect(Collectors.toMap(Function.identity(), f -> f.length()));

        //3  Collectors.groupingBy(Function<T, K>)

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("João", 25),
                new Pessoa("Maria", 30),
                new Pessoa("Lucas", 25),
                new Pessoa("Ana", 30),
                new Pessoa("Pedro", 20)
        );

        Map<Integer, List<Pessoa>> pessoasPorIdade = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getIdade));
        System.out.println(pessoasPorIdade);

        //4 .flatMap(Function<T, Stream< R>>)
        List<List<String>> listasAninhadas = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d", "e")
        );
        Stream<String> plano = listasAninhadas.stream().flatMap(List::stream);

        System.out.println(plano.toList());

        //5 .distinct()

        Stream<String> unicos = Stream.of("a", "b", "a", "c", "b").distinct();
        System.out.println(unicos.toList());

        // 6.sorted()

        Stream<String> ordenado = Stream.of("banana", "acerola", "caju").sorted();
        System.out.println(ordenado.toList());
    }
}