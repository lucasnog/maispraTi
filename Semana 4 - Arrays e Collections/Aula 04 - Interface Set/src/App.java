import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        // SET

        // Set<Integer> set = new HashSet<>();

        // set.add(2);
        // set.add(3);
        // set.add(3);
        // set.add(5);
        // set.add(40);
        // set.add(7);
        // set.add(6);
        // set.add(1);

        // System.out.println(set);

        // LINKEDHASHSET
        // Set<Integer> set = new LinkedHashSet<>();

        // set.add(1);
        // set.add(1);
        // set.add(2);
        // set.add(333);
        // set.add(40);
        // set.add(6);
        // set.add(5);
        // set.add(7);

        // System.out.println(set);

        // TREESET

        Set<Integer> set = new TreeSet<>();

        set.add(1);
        set.add(2);
        set.add(2);
        set.add(333);
        set.add(40);
        set.add(5);
        set.add(6);
        set.add(7);

        System.out.println(set);

    }
}
