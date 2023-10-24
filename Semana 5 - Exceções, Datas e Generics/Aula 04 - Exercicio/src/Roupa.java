import java.util.ArrayList;
import java.util.List;

public class Roupa implements Loja<String> {

    private List<String> itensDaLoja = new ArrayList<>();

    @Override
    public List<String> getItensDaLoja() {
        System.out.println("----");
        System.out.println("Itens da loja:");
        return itensDaLoja;
    }

    @Override
    public void addItem(String item) {
        itensDaLoja.add(item);
    }

}
