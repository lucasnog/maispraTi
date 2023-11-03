import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Utilize o método .filter() para filtrar todos os
        // números ímpares de uma lista de inteiros e imprimir o resultado.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> impares =  numeros.stream().filter(numero -> numero % 2 == 1);
        System.out.println(impares.toList());

        System.out.println("----------");
        // Use o método .map() para transformar uma lista
        // de palavras em sua forma maiúscula.

        List<String> palavras = Arrays.asList("Alou", "ola", "goiania", "bom dia");
        Stream<String> maiuculas = palavras.stream().map(palavra -> palavra.toUpperCase());
        System.out.println(maiuculas.toList());

        System.out.println("----------");
        //Aplique o método .forEach() para imprimir cada
        // número de uma lista de inteiros.

        Stream.of(5, 10, 15, 20).forEach(num -> System.out.println(num));

    }
}