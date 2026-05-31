import java.util.*;

// Comparable Example
class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.id - s.id; // Sort by ID
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class CollectionsFrameworkDemo {
    public static void main(String[] args) {

        // Collection
        Collection<String> collection = new ArrayList<>();
        collection.add("Java");
        collection.add("Python");
        System.out.println("Collection: " + collection);

        // List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Apple"); // Duplicate allowed
        System.out.println("\nList: " + list);

        // Iterable & Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing Enhanced For Loop (Iterable):");
        for (String item : list) {
            System.out.println(item);
        }

        // Set
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // Duplicate ignored
        System.out.println("\nSet: " + set);

        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("\nQueue: " + queue);
        System.out.println("Removed: " + queue.poll());
        System.out.println("Front Element: " + queue.peek());

        // Map
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Anees");
        map.put(102, "John");

        System.out.println("\nMap: " + map);
        System.out.println("Student with ID 101: " + map.get(101));

        // Comparable
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "David"));
        students.add(new Student(1, "Anees"));
        students.add(new Student(2, "John"));

        Collections.sort(students);

        System.out.println("\nComparable (Sort by ID):");
        System.out.println(students);

        // Comparator
        Comparator<Student> sortByName = (s1, s2) -> s1.name.compareTo(s2.name);

        Collections.sort(students, sortByName);

        System.out.println("\nComparator (Sort by Name):");
        System.out.println(students);
    }
}