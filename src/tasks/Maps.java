package tasks;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        Map<Integer,String> vardai = new HashMap<>();

        vardai.put(1, "zuikis");
        vardai.put(2, "ausra");
        vardai.put(3, "jonas");
        System.out.println(vardai);

        System.out.println("______________");
        if (vardai.containsKey(3)) {
            vardai.put(3, "Katinas");
        }

        for (Map.Entry<Integer, String> vardas : vardai.entrySet()) {
            System.out.println(vardas.getKey() + " " + vardas.getValue());
        }

    }
}
