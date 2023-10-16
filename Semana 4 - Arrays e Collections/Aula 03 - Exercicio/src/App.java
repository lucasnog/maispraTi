import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Crie um programa Java que declare uma lista de nomes usando a interface List.
        List<String> listaNomes = new ArrayList<>();

        // Adicione alguns nomes à lista.
        listaNomes.add("Maria");
        listaNomes.add("Mariana");
        listaNomes.add("Mari");
        listaNomes.add("Mariangelica");
        listaNomes.add("Mariabngelica");

        // Imprima a lista completa na tela.
        System.out.println(listaNomes);

        // Verifique se um nome específico está presente na lista.

        listaNomes.contains("Maria");

        // Remova um nome da lista.
        listaNomes.remove("Mari");

        // Imprima a lista novamente para mostrar a mudança.
        System.out.println(listaNomes);

        // Ordene a lista em ordem alfabética.

        Collections.sort(listaNomes);

        // Imprima a lista ordenada.

        System.out.println(listaNomes);

        // Crie uma sublista contendo apenas alguns dos nomes.

        listaNomes.subList(0, 2);

        // Imprima a sublista.

        System.out.println(listaNomes.subList(1, 3));

        // Limpe a lista, removendo todos os elementos.

        listaNomes.removeAll(listaNomes);

        // Imprima a lista vazia para confirmar.

        System.out.println(listaNomes);
    }
}
