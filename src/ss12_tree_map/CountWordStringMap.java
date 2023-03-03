package ss12_tree_map;

import java.util.Scanner;
import java.util.TreeMap;

public class CountWordStringMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> wordCount = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[] words = text.split(" ");
        for (String word : words) {
            word = word.toLowerCase();
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + ": " + count);
        }
    }
}

