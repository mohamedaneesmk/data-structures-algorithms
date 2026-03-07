public class StringBuilderConcepts {

    public static void main(String[] args) {

        // 1️⃣ Creating StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // 2️⃣ append()
        sb.append(" World");
        System.out.println(sb);

        // 3️⃣ insert()
        sb.insert(5, " Java");
        System.out.println(sb);

        // 4️⃣ delete()
        sb.delete(5,10);
        System.out.println(sb);

        // 5️⃣ deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println(sb);

        // 6️⃣ reverse()
        sb.reverse();
        System.out.println(sb);

        // 7️⃣ length()
        System.out.println(sb.length());

        // 8️⃣ charAt()
        System.out.println(sb.charAt(2));

        // 9️⃣ setCharAt()
        sb.setCharAt(0, 'H');
        System.out.println(sb);

        // 🔟 capacity()
        System.out.println(sb.capacity());

        // 1️⃣1️⃣ ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

        // 1️⃣2️⃣ replace()
        sb.replace(0,5,"Java");
        System.out.println(sb);

        // 1️⃣3️⃣ substring()
        System.out.println(sb.substring(0,4));

        // 1️⃣4️⃣ Converting StringBuilder → String
        String str = sb.toString();
        System.out.println(str);

        // 1️⃣5️⃣ Using StringBuilder in loops (performance)
        StringBuilder numbers = new StringBuilder();

        for(int i=0;i<10;i++){
            numbers.append(i);
        }

        System.out.println(numbers);

    }
}