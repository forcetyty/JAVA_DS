package list;

import java.util.ArrayList;
import java.util.List;

public class List01_ArrayList {
    public static void main(String[] args) {
        // Java List ArrayList
        List<String> list = new ArrayList<>();

        list.add("첫번째");
        list.add("두번째");

        System.out.println(" >>>>> " + list.get(0));
        System.out.println(" >>>>> " + list.size());

    }
}
