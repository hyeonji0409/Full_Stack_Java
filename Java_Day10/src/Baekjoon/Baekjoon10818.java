package Baekjoon;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Baekjoon10818 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Random rand = new Random();

        int N = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        scan.close();
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[N - 1]);

    }
}
