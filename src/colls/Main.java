package colls;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> list = new HashMap<>();
        list.put("A", 1);
        list.put("B", 2);
        list.put("C", 3);
        list.put("D", 4);
        list.put("E", 5);

        // #1
        for (Map.Entry<String, Integer> entry : list.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // #2
        System.out.println(list.toString());

        // #3
        list.forEach((key, value) -> System.out.println(key + ": " + value));

        // #4 with filter
        list.entrySet()
                .stream()
                .filter(temp -> temp.getValue()>3)
                .forEach(temp -> System.out.println(temp.getKey() + ": " + temp.getValue()));
    }
}
