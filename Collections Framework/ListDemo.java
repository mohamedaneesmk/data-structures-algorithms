/*
List<T> — ordered, allows duplicates, index-based access. Class ArrayList — fast get/set. Class LinkedList — fast add/remove at ends.
*/

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("Anees");
        students.add("Jameel");
        students.add("Praveen");
        students.add("Hariharan");
        students.add("Peer Mohamed");

        System.out.println(students.get(1)); // get by index
        students.set(2, "Aslam"); // update by index
        students.remove(4); // remove by index

        System.out.println(students);
        System.out.println("Index of Jameel : " + students.indexOf("Jameel"));

        // subList - like extracting a range
        List<String> sub = students.subList(0, 2);
        System.out.println("Sub : " + sub);
    }
}
