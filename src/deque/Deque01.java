package deque;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        // 요소 추가
        deque.addFirst(1);  // 앞쪽에 1 추가
        deque.addLast(10);  // 뒤쪽에 10 추가

        System.out.println(" >>>>> " + deque);

        // 앞쪽과 뒤쪽에서 요소 가져오기
        System.out.println(" F >>>>> " + deque.getFirst());
        System.out.println(" L >>>>> " + deque.getLast());

        // 앞쪽과 뒤쪽에서 요소 제거
        deque.removeFirst();
        deque.removeLast();

        System.out.println(" >>>>> " + deque);
    }
}
