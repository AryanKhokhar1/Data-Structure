import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            frequencySort(arr);
        }
    }

    public static void frequencySort(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
        entryList.sort((e1, e2) -> {
            if (!e1.getValue().equals(e2.getValue())) {
                return e1.getValue() - e2.getValue();
            } else {
                return e1.getKey() - e2.getKey();
            }
        });

        List<Integer> sortedArr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            for (int i = 0; i < entry.getValue(); i++) {
                sortedArr.add(entry.getKey());
            }
        }

        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
