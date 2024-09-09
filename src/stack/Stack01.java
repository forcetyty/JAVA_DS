package stack;

import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println(" 스택 상태 : " + stack);

        // peek() 메소드로 맨 위 요소 확인
        System.out.println(" 맨 위 요소 : " + stack.peek());

        // pop() 메소드를 사용하여 맨 위 요소 제거 및 반환
        System.out.println(" 제거된 요소 : " + stack.pop());
        System.out.println(" 스택 상태 : " + stack);

        // 스택이 비었는지 확인
        System.out.println(" 스택 empty 체크 : " + stack.empty());

    }
}
