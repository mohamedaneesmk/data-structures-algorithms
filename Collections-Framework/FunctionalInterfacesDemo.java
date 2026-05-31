import java.util.function.*;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {

        // Lambda Expression
        Runnable r = () -> System.out.println("Hello from Lambda!");
        r.run();

        // Consumer<T>
        Consumer<String> consumer = name ->
                System.out.println("Welcome " + name);
        consumer.accept("Anees");

        // Supplier<T>
        Supplier<String> supplier = () -> "Java Developer";
        System.out.println("Supplier: " + supplier.get());

        // Function<T, R>
        Function<String, Integer> function = str -> str.length();
        System.out.println("Length: " + function.apply("Anees"));

        // Predicate<T>
        Predicate<Integer> predicate = num -> num > 18;
        System.out.println("Is Adult? " + predicate.test(21));

        // UnaryOperator<T>
        UnaryOperator<Integer> square = num -> num * num;
        System.out.println("Square: " + square.apply(5));

        // BinaryOperator<T>
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Sum: " + add.apply(10, 20));
    }
}