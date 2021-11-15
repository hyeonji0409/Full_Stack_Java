package Goorm;

import java.util.Scanner;

public class Math_sqrt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int cnt = 0;
        for(int i = 0; i<n; i++){
            int num = scan.nextInt();
            if(num % Math.sqrt(num) == 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
