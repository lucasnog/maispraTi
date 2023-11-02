
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        /* 1 Dado uma lista de números inteiros, crie um
        Predicate para verificar se um número é par. Utilize esse predicado
         para filtrar todos os números pares da lista e imprimir o resultado.:
         */

        Integer[] arrayNumeros = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> numerosPares = new ArrayList<>();

        Predicate<Integer> par = numero -> numero% 2 == 0;
        System.out.println(par.test(arrayNumeros[0]));

        for(Integer numero : arrayNumeros){
            if(par.test(numero)){
                numerosPares.add(numero);
            }
        }
        System.out.println(numerosPares);

        /* Dado uma lista de palavras, crie uma Function que transforme
        cada palavra em seu comprimento (quantidade de caracteres).
        Utilize essa função para converter a lista de palavras em
        uma lista de inteiros representando o tamanho de cada palavra e
        imprima o resultado.*/

        String[] arrayPalavras = {"Java", "Lambda", "Interface", "Função"};
        List<Integer> palavrasEmNumeros = new ArrayList<>();
        Function<String, Integer> contarLetras = (palavra) -> palavra.length();

        for(String palavra : arrayPalavras){
            palavrasEmNumeros.add(contarLetras.apply(palavra));
        }

        System.out.println(palavrasEmNumeros);

        /* Crie um Consumer que receba uma string e imprima a mensagem "Olá,
         [string]!". Utilize esse consumidor para saudar cada
         uma das seguintes pessoas: "Maria", "João", e "Lucas". Saida Exemplo:
         */

        String[] arrayNomes = {"Maria", "João", "Marlon"};
        Consumer<String> olaNome = nome -> System.out.println("Olá " + nome +"!");
        for(String nome : arrayNomes){
            olaNome.accept(nome);
        }
    }
}