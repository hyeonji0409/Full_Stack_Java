package Baekjoon;

import java.util.Scanner;

public class Baekjoon2438 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        char[][] star = new char[n][n];

        for(int i = 0; i<star.length;i++){
            for(int j = 0; j<i+1;j++){
                star[i][j] = '*';
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
    }
}
