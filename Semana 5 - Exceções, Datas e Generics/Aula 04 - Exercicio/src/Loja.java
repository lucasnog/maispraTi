
import java.util.List;

public interface Loja<T> {

    public List<T> getItensDaLoja();

    public void addItem(T item);

}
