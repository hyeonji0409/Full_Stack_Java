package Baekjoon;

import java.util.Random;
import java.util.Scanner;

public class Baekjoon2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[9];
        int max = 0;
        int maxcnt = 0;
        int count = 0;

        for(int i = 0; i<=arr.length;i++){
            arr[i] = scan.nextInt();
        }

        for(int value : arr){
            maxcnt++;
            if(value > max){
                max = value;
                maxcnt = count;
            }
        }
        System.out.println(max);
        System.out.println(maxcnt);
    }
}
