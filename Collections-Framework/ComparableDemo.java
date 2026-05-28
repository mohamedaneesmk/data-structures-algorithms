import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Sort by marks (natural order)
    public int compareTo(Student other) {
        return this.marks - other.marks; // ascending
    }

    public String toString() {
        return name + "(" + marks + ")";
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Aarav", 85));
        list.add(new Student("Priya", 92));
        list.add(new Student("Rahul", 78));

        Collections.sort(list); // uses compareTo
        System.out.println(list);
    }
}