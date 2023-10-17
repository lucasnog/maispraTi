import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {

        // Map<Integer, String> turma = new HashMap<>();

        // turma.put(1, "Lucas");
        // turma.put(2, "david");
        // turma.put(3, "luisa");

        // turma.put(null, "maria");
        // System.out.println(turma);

        // Map<Integer, String> turma = new TreeMap<>();

        // turma.put(1, "Lucas");
        // turma.put(2, "david");
        // turma.put(3, "luisa");

        // turma.put(1, "maria");
        // System.out.println(turma);

        Map<Integer, String> turma = new LinkedHashMap<>();

        turma.put(1, "Lucas");
        turma.put(5, "Lucas");
        turma.put(2, "david");
        turma.put(3, "luisa");

        turma.put(null, "maria");
        System.out.println(turma.get(1));
        System.out.println(turma.containsValue("Lucas"));
        System.out.println(turma.containsKey(1));

        Set<Integer> keys = turma.keySet();

        System.out.println(keys);

        List<String> values = new ArrayList<>(turma.values());

        System.out.println(values);

        Set<String> values2 = new HashSet<>(turma.values());

        System.out.println(values2);

    }
}
