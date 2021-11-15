package Goorm;

import java.util.Scanner;

public class Narcissistic_Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        int start = scan.nextInt();
        int end = scan.nextInt();
        for(int i = start; i<end;i++){
            n=i;
            int total = 0;
            while(n!=0){
                total += Math.pow(n%10,3);
                n = n/10;
            }
            if(total == i) System.out.print(i + " ");
        }
    }
}
