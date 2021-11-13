package Baekjoon;

import java.util.Scanner;

public class Baekjoon1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        float arr[] = new float[n];

        int max = 0;
        float sum = 0;
        float maxScore;
        for(int i = 0; i<arr.length;i++){
            arr[i] = scan.nextInt();
            if(arr[max]<arr[i]){
                max = i;
            }
        }

        maxScore = arr[max];
        for(int i = 0; i<arr.length;i++){
            arr[i] = arr[i]/maxScore * 100;
            sum += arr[i];
        }
        System.out.println(sum/n);
    }

}
