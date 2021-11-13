package Baekjoon;

import java.util.Scanner;

public class Baekjoon2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];

        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        int value = x*y*z;
        String str = Integer.toString(value);

        for(int i = 0; i<arr.length;i++){
            int count = 0;
            for(int j = 0; j<str.length();j++){
                if((str.charAt(j)-'0')==i){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
