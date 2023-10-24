public class ComparadorString implements Comparador<String> {

    @Override
    public int comparar(String o1, String o2) {

        return o1.compareTo(o2);
    }

}
