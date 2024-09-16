package queue;

import jdk.jshell.spi.ExecutionControl;

import java.util.*;

public class Queue02 {
    public static void main(String[] args) {
        // Queue - LinkedList로 구현하는 대기번호
        Queue<String> queue = new LinkedList<>();
        Timer time = new Timer();

        queue.add("김철수");
        queue.add("홍길동");
        queue.add("양동근");
        queue.add("김길수");


        System.out.println("-------------------------------------------");
        System.out.println(">>>>> " + queue.toString() + " 대기중입니다.");

        int qSize = queue.size();
        for(int i = 0; i < qSize; i++ ){
            System.out.println("-------------------------------------------");
            try{
                Thread.sleep(2000);
                System.out.println(">>>>> " + queue.poll() + " 입장했습니다");
                System.out.println(">>>>> " + queue.size() + " 명 대기중입니다.");

                if(queue.size() == 0){
                    System.out.println("-------------------------------------------");
                    System.out.println(" 모두 입장 완료하였습니다. ");
                    System.out.println("-------------------------------------------");
                    System.out.println(" >> 시스템을 종료합니다. ");
                    System.out.println("-------------------------------------------");
                    System.exit(0); // 프로그램 종료
                }

            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }


    }

}
