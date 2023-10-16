import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> lista = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();

        lista.add("computador");
        lista.add("cadeira");
        lista2.add("ae");
        lista2.add("ea");

        System.out.println(lista);
        System.out.println(lista.size());
        System.out.println(lista.contains("computador"));
        System.out.println(lista.add("mouse"));
        System.out.println(lista.remove("mouse"));
        System.out.println(lista.get(1));
        System.out.println(lista.indexOf("computador"));
        System.out.println(lista.lastIndexOf("cadeira"));
        System.out.println(lista.subList(0, 2));
        System.out.println(lista.addAll(0, lista2));
        System.out.println(lista);
        System.out.println(lista.retainAll(lista2));
        System.out.println(lista);
        System.out.println(lista.toArray());

    }
}
