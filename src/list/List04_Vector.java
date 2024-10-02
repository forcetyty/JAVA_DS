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

        System.out.println(
                vector.toString()
        );

    }
}
