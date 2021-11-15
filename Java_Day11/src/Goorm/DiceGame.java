package Goorm;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int x = 1;
        int y = 1;

        for(int i = 1; i<=num; i++){
            if(num-i <= 6 && num-i >0 && i<=6) System.out.println(i+" "+(num-i));
        }
    }
}
