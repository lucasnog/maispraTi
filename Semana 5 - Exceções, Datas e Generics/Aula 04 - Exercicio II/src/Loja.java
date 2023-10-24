
import java.util.ArrayList;
import java.util.List;

public class Loja<T> {

    private List<T> itensDaLoja = new ArrayList<>();

    public List<T> getItensDaLoja() {
        System.out.println("----");
        System.out.println("Itens da loja:");
        return itensDaLoja;
    };

    public void addItem(T item) {
        System.out.println("----");
        System.out.println("Item " + item + " adicionado com sucesso.");
        itensDaLoja.add(item);
    };

}
