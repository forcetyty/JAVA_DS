package stack;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue02 {
    public static void main(String[] args) {
        // Queue 자료구조 실습
        // 1. LinkedList
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(" 큐 상태 : " + queue);
        System.out.println(" 큐의 첫번째 요소를 반환하되 제거하지 않음 : " + queue.peek());
        System.out.println(" 큐의 첫번째 요소를 제거하고 반환 : " + queue.poll());
        System.out.println(" 큐 상태 : " + queue);

        // 2. PriorityQueue
        // 우선순위 큐로 들어온 순서와 상관없이 우선순위가 높은 요소가 먼저 나가는 구조
        Queue<Integer> queue2 = new PriorityQueue<>();

        queue2.add(3);
        queue2.add(2);
        queue2.add(1);

        System.out.println(" 큐 상태 2 : " + queue2);
        System.out.println(" 큐의 첫번째 요소를 반환하되 제거하지 않음 2 : " + queue2.peek());
        System.out.println(" 큐의 첫번째 요소를 제거하고 반환 2 : " + queue2.poll());
        System.out.println(" 큐 상태 2 : " + queue2);

        // 3. ArrayDeque
        // 큐 뿐만 아니라 스택처럼도 사용 할 수 있는 Deque(Double Ended Queue)
        // 양반향에서 요소를 추가하거나 제거할 수 있어 유용함
        Queue<Integer> queue3 = new ArrayDeque<>();

        queue3.add(1);
        queue3.add(2);
        queue3.add(3);

        System.out.println(" 큐 상태 3 : " + queue3);
        System.out.println(" 큐의 첫번째 요소를 반환하되 제거하지 않음 3 : " + queue3.peek());
        System.out.println(" 큐의 첫번째 요소를 제거하고 반환 3 : " + queue3.poll());
        System.out.println(" 큐 상태 3 : " + queue3);



    }
}
