package Goorm;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int idx = 0;
        for(int i = 0; i<arr.length; i++){
            arr[i] = scan.nextInt();
            if(max < arr[i]){
                max = arr[i];
                idx = i;
            }
        }
        System.out.println(max +" "+idx);
    }
}
