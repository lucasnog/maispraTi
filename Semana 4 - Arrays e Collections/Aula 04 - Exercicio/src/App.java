import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        // Crie um programa Java que declare um conjunto de números usando a interface
        // Set.
        Set<Integer> set = new HashSet<>();

        // Adicione alguns números ao conjunto, garantindo que não haja duplicatas.
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        // Imprima o conjunto completo na tela.

        System.out.println(set);

        // Verifique se um número específico está presente no conjunto.

        System.out.println(set.contains(1));

        // Remova um número do conjunto.
        set.remove(5);

        // Imprima o conjunto novamente para mostrar a mudança.
        System.out.println(set);

        // Adicione mais números ao conjunto.

        set.add(6);

        // Crie uma cópia do conjunto original.

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(5);

        // Use o método retainAll() para manter apenas os números presentes na cópia do
        // conjunto.

        set.retainAll(set2);

        // Imprima o conjunto após a operação retainAll().

        System.out.println(set);

        // Limpe o conjunto, removendo todos os elementos.

        set.removeAll(set);

        // Imprima o conjunto vazio para confirmar.

        System.out.println(set);
    }
}
