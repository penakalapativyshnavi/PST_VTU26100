import java.util.Scanner;

public class SecondHighest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] < highest && arr[i] > secondHighest) {
                secondHighest = arr[i];
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(secondHighest);
        }
    }
}