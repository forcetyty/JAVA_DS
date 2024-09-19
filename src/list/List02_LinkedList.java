package list;

import java.util.LinkedList;
import java.util.List;

public class List02_LinkedList {
    public static void main(String[] args) {
        // Java List LinkedList
        List<String> list = new LinkedList<>();

        list.add("첫번째");
        list.add("세번째");

        System.out.println(" >>>>> " + list.toString());

        // 데이터 중간 삽입
        list.add(1, "두번째");

        System.out.println(" >>>>> " + list.toString());

    }
}
