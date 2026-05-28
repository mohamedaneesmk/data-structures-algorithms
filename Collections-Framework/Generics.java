public class Generics {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Anees");
        System.out.println(stringBox.getItem());

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(45);
        System.out.println(integerBox.getItem());


        Product<String,Integer> product = new Product<>();
        product.setProduct("Laptop", 80000);
        System.out.println(product.getItem());
        System.out.println(product.getPrice());
    }
}
