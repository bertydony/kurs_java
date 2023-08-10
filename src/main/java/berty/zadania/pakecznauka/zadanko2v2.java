package berty.zadania.pakecznauka;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class zadanko2v2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(23);
        list.add(65);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

    }
}
