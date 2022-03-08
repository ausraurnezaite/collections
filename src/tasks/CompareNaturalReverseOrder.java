package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompareNaturalReverseOrder {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList(Arrays.asList(5, 8, 6, 10));

        for (int element : list) {
            System.out.print(element + " ");
        }

        list.sort(Comparator.naturalOrder());

        System.out.println("\n_______naturalOrder________");
        for (Integer element : list) {
            System.out.print(element + " ");
        }

        list.sort(Comparator.reverseOrder());

        System.out.println("\n_______reverseOrder________");
        for (Integer element : list) {
            System.out.print(element + " ");
        }


    }
}
