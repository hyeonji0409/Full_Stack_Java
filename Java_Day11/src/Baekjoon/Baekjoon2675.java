package Baekjoon;

import java.util.Scanner;

public class Baekjoon2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 문자 알파벳 처리
        int r = scan.nextInt();
        String word = scan.next();
        String[] array_word;
        array_word = word.split("");

        for(int i = 0; i<array_word.length;i++){
            for(int j = 0; j <r; j++){
                System.out.print(array_word[i]);
            }
        }
        System.out.println();
    }
}
