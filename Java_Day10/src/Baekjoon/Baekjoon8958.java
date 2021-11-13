package Baekjoon;

import java.util.Scanner;

public class Baekjoon8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        String str;
        for(int i = 0; i<t;i++){
            str = scan.next();
            int sum = 0, cnt = 0;
            for(int j = 0; j<str.length();j++){
                if(str.charAt(j)=='O'){
                    cnt++;
                    sum += cnt;
                }
                else cnt = 0;
            }
            System.out.println(sum);
        }
    }
}
