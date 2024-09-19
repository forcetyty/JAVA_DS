package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List03_ArrayList {

    public static void main(String[] args) {
        // 동적으로 입력받는 학생이름을 저장한 후 출력하는 코드

        // 학생 이름을 담을 List
        List<String> studentName = new ArrayList<>();

        // 입력받을수 있도록 Scanner 사용
        Scanner scanNum = new Scanner(System.in);
        Scanner scanName = new Scanner(System.in);

        System.out.print(" >>>>> 입력 할 학생 수를 입력하세요 : " );
        // 입력받을 학생 수 지정
        //String nameTemp = "";
        int studentNum = scanNum.nextInt();

        for(int i = 0; i < studentNum; i++){
            System.out.print(" >>>>> 학생 이름을 입력 하세요 : ");

            String nameTemp = scanName.nextLine();
            studentName.add(nameTemp);
        }

        System.out.println(" >>>>> 총 학생 수 : " + studentNum + " 명 ");
        for(int j = 0; j < studentName.size(); j++){
            System.out.print( (j+1) + " 번째 학생 : " + studentName.get(j) + " | ");
        }


    }

}
