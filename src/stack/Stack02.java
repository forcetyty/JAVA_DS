package stack;

import java.util.Stack;

public class Stack02 {
    public static void main(String[] args) {
        // 스택예제
        // 뒤로가기
        Stack<String> stack = new Stack<>();
        String out = "";

        // 1.실행
        stack.add("안녕하세요");
        stack.add(" ");
        stack.add("저는");
        stack.add(" ");
        stack.add("홍길동");
        stack.add(" ");
        stack.add("입니다.");

        // 출력
        for(String str : stack){
            out += str;
        }
        System.out.println(" (1) >>>>> " + out);

        // 2. 뒤로가기
        stack.pop();
        stack.pop();
        stack.pop();

        // 3. 신규 입력
        stack.add("김철수");
        stack.add(" ");
        stack.add("입니다.");

        // 출력
        out = ""; // 초기화
        for(String str : stack){
            out += str;
        }
        System.out.println(" (2) >>>>> " + out);

    }
}
