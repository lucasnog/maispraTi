import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       boolean igual = compare(1,1);
        System.out.println(igual);

        processaList(Arrays.asList(1,2,3,4,5,6,7));
        processaList(Arrays.asList("Joao", "Luis", "Barbara"));

        System.out.println(soma(1.1, 2.1));

    }

    public static <T> boolean compare(T o1, T o2) {
        return o1.equals(o2);
    }

    public static <T> void processaList(List<T> lista){
        for (T t: lista){
            System.out.println(t);
        }
    }
    public static <T extends Number & Comparable> double soma(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

}