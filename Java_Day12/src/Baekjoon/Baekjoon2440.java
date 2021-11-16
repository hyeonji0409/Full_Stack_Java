package Baekjoon;

import java.util.Scanner;

public class Baekjoon2440 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        char[][] star = new char[n][n];

        for(int i = 0; i<star.length;i++){
            for(int j = n; j >= i+1 ; --j){
                System.out.print("*");
            }
            for(int k = 0; k < i+1; k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

