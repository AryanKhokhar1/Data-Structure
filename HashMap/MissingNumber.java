import java.util.*;

class MissingNumber {

    public static int[] missingNumbers(int[] arr, int[] brr) {
        Map<Integer, Integer> countArr = new HashMap<>();
        Map<Integer, Integer> countBrr = new HashMap<>();

        for (int num : arr) {
            countArr.put(num, countArr.getOrDefault(num, 0) + 1);
        }

        for (int num : brr) {
            countBrr.put(num, countBrr.getOrDefault(num, 0) + 1);
        }

        List<Integer> missingNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countBrr.entrySet()) {
            int num = entry.getKey();
            int freqBrr = entry.getValue();
            int freqArr = countArr.getOrDefault(num, 0);

            if (freqArr < freqBrr) {
                missingNumbers.add(num);
            }
        }

        Collections.sort(missingNumbers);

        int[] result = new int[missingNumbers.size()];
        for (int i = 0; i < missingNumbers.size(); i++) {
            result[i] = missingNumbers.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] brr = new int[m];
        for (int i = 0; i < m; i++) {
            brr[i] = scanner.nextInt();
        }

        int[] missing = missingNumbers(arr, brr);

        for (int num : missing) {
            System.out.print(num + " ");
        }
    }
}
