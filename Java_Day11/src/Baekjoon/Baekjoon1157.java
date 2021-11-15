package Baekjoon;

import java.util.Scanner;

public class Baekjoon1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next().toUpperCase();

        int[] alphabet = new int[26];

        int max = 0;
        char st = '?';

        for(int i = 0; i< word.length();i++){
            alphabet[word.charAt(i)-65]++;
            if(max<alphabet[word.charAt(i)-65]) {
                max = alphabet[word.charAt(i)-65];
                st = word.charAt(i);
            }
            else if(max==alphabet[word.charAt(i)-65]) st = '?';
        }
        System.out.println(st);
    }
}
