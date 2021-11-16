package Baekjoon;

import java.util.Scanner;

public class Baekjoon15596 {
    static long sum(int[] a){
        long ans = 0;

        for(int i = 0; i<a.length;i++){
            ans += a[i];
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int[] arr = new int[num];


    }
}
