import javax.sound.midi.Soundbank;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        //primeiro exemplo Predicate<>
        Predicate<Integer> ePar = numero -> numero%2 ==0;

        System.out.println(ePar.test(4));
        System.out.println(ePar.test(1));

        //segundo exemplo Function<T,R>
        Function<String, Integer> funcaoTamanho = texto -> texto.length();

        System.out.println(funcaoTamanho.apply(("alfamidia")));


        //terceiro exemplo StartsWith <T, R>
        Function<String, Boolean> funcaoStartsWith = texto -> texto.startsWith("M");
        System.out.println(funcaoStartsWith.apply("Marlon"));


        //quarto exemplo Supplier<T>

        Supplier<String> fornecedorSaudacao = () -> "Olá, mundo!";
        System.out.println(fornecedorSaudacao.get());

        //quinto exemplo Consumer<T>

        Consumer<String> consumidorImpressao = texto -> System.out.println(texto);
        consumidorImpressao.accept("Interfaces Funcionais em java");

        //sexto exemplo BinaryOperator<T>

        BinaryOperator<Integer> operadorSoma = (num1, num2) -> num1 + num2;
        System.out.println(operadorSoma.apply(5, 2));

        BinaryOperator<String> operadorConcat = (a1, a2) -> a1 + a2;
        System.out.println(operadorConcat.apply("oi", " meu chapa"));
    }
}