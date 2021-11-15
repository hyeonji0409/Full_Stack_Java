package Goorm;

import java.util.Scanner;

public class Electronic_Bill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int electronic = scan.nextInt();
        double pay;
        if(electronic <100){
            pay = electronic * 0.005;
            System.out.printf("%.2f",pay);
        }
        else if(electronic>=100 && electronic<200){
            pay = electronic * 0.007;
            System.out.printf("%.2f",pay);
        }
        else if(electronic>=200 && electronic<300){
            pay = electronic * 0.009;
            System.out.printf("%.2f",pay);
        }
        else{
            pay = electronic * 0.01;
            System.out.printf("%.2f",pay);
        }
    }
}
