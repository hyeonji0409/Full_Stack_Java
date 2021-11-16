package Baekjoon;

import java.util.Random;
import java.util.Scanner;

public class Baekjoon2798 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int max = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum <= m) {
                        max = Math.max(max, sum);
                    }
                    if (max == m) {
                        break;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
