public class StringConcepts {

    public static void main(String[] args) {

        // 1️⃣ Creating Strings
        String s1 = "Java";
        String s2 = "Java"; // stored in String Pool
        String s3 = new String("Java"); // new object in heap

        // 2️⃣ Comparing Strings
        System.out.println(s1 == s2);       // true (same reference in pool)
        System.out.println(s1 == s3);       // false (different objects)
        System.out.println(s1.equals(s3));  // true (same content)

        // 3️⃣ String is Immutable
        String str = "Hello";
        str.concat(" World");   // does not modify original
        System.out.println(str);

        str = str.concat(" World");
        System.out.println(str);

        // 4️⃣ length()
        System.out.println(str.length());

        // 5️⃣ charAt()
        System.out.println(str.charAt(1));

        // 6️⃣ substring()
        System.out.println(str.substring(0,5));

        // 7️⃣ toUpperCase / toLowerCase
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // 8️⃣ contains()
        System.out.println(str.contains("World"));

        // 9️⃣ replace()
        System.out.println(str.replace("World","Java"));

        // 🔟 indexOf()
        System.out.println(str.indexOf("World"));

        // 1️⃣1️⃣ startsWith / endsWith
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("World"));

        // 1️⃣2️⃣ trim()
        String space = "   Java   ";
        System.out.println(space.trim());

        // 1️⃣3️⃣ split()
        String sentence = "Java is powerful";
        String[] words = sentence.split(" ");

        for(String w : words){
            System.out.println(w);
        }

        // 1️⃣4️⃣ String concatenation
        String a = "Hello";
        String b = "Java";
        String result = a + " " + b;
        System.out.println(result);

        // 1️⃣5️⃣ String Pool Example
        String x = "Code";
        String y = "Code";

        if(x == y){
            System.out.println("Same reference in pool");
        }

        // 1️⃣6️⃣ Converting String → char array
        char[] arr = str.toCharArray();
        for(char c : arr){
            System.out.print(c + " ");
        }

    }
}