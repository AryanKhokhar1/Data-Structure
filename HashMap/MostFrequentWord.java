import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine(); // Consume the newline character

        HashMap<String, Integer> map = new HashMap<>();
        int maxCount = 0;
        String mostFrequentWord = "";

        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            map.put(word, map.getOrDefault(word, 0) + 1);
            int count = map.get(word);

            // Update the most frequent word
            if (count > maxCount || (count == maxCount && word.compareTo(mostFrequentWord) > 0)) {
                maxCount = count;
                mostFrequentWord = word;
            }
        }

        System.out.println(mostFrequentWord + " " + maxCount);
    }
}
