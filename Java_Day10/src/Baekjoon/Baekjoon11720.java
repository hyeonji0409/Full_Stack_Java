package Baekjoon;

import java.util.Scanner;

public class Baekjoon11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int sum=0;
        String line = scan.next();

        for(int i=0; i<num; i++) {
            sum += line.charAt(i)-'0';
        }

        System.out.println(sum);
    }
}