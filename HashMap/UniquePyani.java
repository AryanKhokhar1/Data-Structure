import java.util.Scanner;

public class UniquePyani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int uniqueNumber = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            uniqueNumber ^= num;
        }

        System.out.println(uniqueNumber);
    }
}
