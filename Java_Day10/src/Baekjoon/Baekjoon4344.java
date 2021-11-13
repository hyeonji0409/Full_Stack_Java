package Baekjoon;

import java.util.Scanner;

public class Baekjoon4344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        int total = 0;
        for(int i = 0; i<arr.length;i++){
            arr[i] = scan.nextInt();
            total += arr[i];
        }

        double avg = total/n;

        double count = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>avg){
                count++;
            }
        }

        double avg2 = count / n * 100;
        System.out.printf("%.3f%%\n", avg2);
    }
}


