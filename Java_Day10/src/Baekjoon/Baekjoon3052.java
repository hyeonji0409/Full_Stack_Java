package Baekjoon;

import java.util.Scanner;

public class Baekjoon3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        int[] mod = new int[10];

        boolean flag;
        int cnt = 0;

        for(int i = 0; i<arr.length;i++){
            arr[i] = scan.nextInt();
            mod[i] = arr[i] % 42;
        }

        for(int i = 0; i<mod.length;i++){
            flag = false;
            for(int j = i+1; j<mod.length;j++){
                if(mod[i]==mod[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
