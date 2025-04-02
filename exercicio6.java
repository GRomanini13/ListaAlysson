import java.util.*;

public class exercicio6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        List<Integer> novoArray = removerDuplicatas(array);

        System.out.println(novoArray);
    }

    public static List<Integer> removerDuplicatas(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return new ArrayList<>(set);
    }
}
