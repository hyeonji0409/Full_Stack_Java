package Baekjoon;

import java.util.Scanner;

public class Baekjoon2908 {

    static int reverse(int n){
        int q = n;
        int r = 0;

        int m = 0;
        while(q !=0){
            r = q%10;
            q = q/10;
            m = m*10+r;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int revA = reverse(a);
        int revB = reverse(b);

        if(revA < revB) System.out.println(revB);
        else System.out.println(revA);
    }
}
