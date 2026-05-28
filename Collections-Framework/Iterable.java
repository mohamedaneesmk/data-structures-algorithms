/*
Interface Iterable<T> — any class that implements this can be used in a for-each loop. It must provide an Iterator.

Interface Iterator<T> has 2 key methods: hasNext() — is there a next element? & next() — give me the next one.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // for-each works because List implements Table
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}