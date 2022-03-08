package tasks.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findFirst {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("B", "A", "C");

        Optional<String> a = list.stream().findFirst();
        list.stream().findFirst();
        System.out.println(a.get());
    }
}
