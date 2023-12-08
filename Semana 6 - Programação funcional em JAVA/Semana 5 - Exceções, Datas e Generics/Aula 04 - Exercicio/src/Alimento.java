import java.util.ArrayList;
import java.util.List;

public class Alimento implements Loja<String> {

    private List<String> itensDaLoja = new ArrayList<>();

    @Override
    public List<String> getItensDaLoja() {
        System.out.println("----");
        System.out.println("Itens da loja:");
        return itensDaLoja;
    }

    @Override
    public void addItem(String item) {
        System.out.println("----");
        System.out.println("Item " + item + " adicionado com sucesso.");
        itensDaLoja.add(item);
    }

}