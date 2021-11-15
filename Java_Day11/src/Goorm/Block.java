package Goorm;

import java.util.Scanner;

public class Block {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        int left_max = 0;
        int left_cnt = 0;
        int right_max = 0;
        int right_cnt = 0;

        left_max = arr[0];
        left_cnt++;
        for(int i = 1; i<n;i++) {
            if(arr[i]>left_max){
                left_max = arr[i];
                left_cnt++;
            }
        }

        right_max = arr[n-1];
        right_cnt++;
        for(int i = n-2; i>=0;i--){
            if(arr[i]>right_max){
                right_max = arr[i];
                right_cnt++;
            }
        }
        System.out.println(left_cnt+" "+ right_cnt);
    }
}
