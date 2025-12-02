package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any sentence = ");

        String sentence = scanner.nextLine().toLowerCase();
        sentence = sentence.replaceAll("[^a-zA-Z ]", ""); // remove punctuation

        String[] words = sentence.split("\\s+");

        ArrayList<String> list = new ArrayList<>();

        for (String word : words) {
            if (!list.contains(word)) {
                list.add(word);
            }
        }
 
        Collections.sort(list);

        System.out.println("Unique sorted words: " + list);

        scanner.close();
    }
}
