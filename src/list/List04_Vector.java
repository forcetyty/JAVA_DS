package list;

import java.util.Vector;

public class List04_Vector {

    public static void main(String[] args) {

        // ArrayList와 유사함
        Vector<String> vector = new Vector<>();

        // 차이점이 있다면 vector는 ArrayList와 다르게 동기화가 선언되어 있다는 점
        //        public synchronized void addElement(E obj) {
        //            modCount++;
        //            add(obj, elementData, elementCount);
        //        }
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
        vector.add("5");
        vector.add("6");
        vector.add("7");
        vector.add("8");
        vector.add("9");
        vector.add("10");
        vector.add("11");

        System.out.println(vector.toString());
        // Vector 초기 사이즈는 10
        // 동적으로 사이즈를 늘림
        System.out.println(" 크기확인 >>>> " + vector.capacity());
    }


}
