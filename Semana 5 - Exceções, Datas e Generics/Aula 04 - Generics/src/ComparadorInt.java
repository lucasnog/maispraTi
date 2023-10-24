public class ComparadorInt implements Comparador<Integer> {

    @Override
    public int comparar(Integer o1, Integer o2) {

        return o1.compareTo(o2);
    }

}
