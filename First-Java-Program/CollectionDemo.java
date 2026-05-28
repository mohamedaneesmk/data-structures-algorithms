import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> bag = new ArrayList<>();

        bag.add("Pen");
        bag.add("Book");
        bag.add("Pencil");

        System.out.println("Size : " + bag.size());
        System.out.println("Has Pen ? : "+ bag.contains("Pen"));

        bag.remove("Pen");
        System.out.println("After removing Pen : " + bag);


        System.out.println("Has Pen ? " + bag.contains("Pen"));
    }
}
