package Goorm;

import java.util.Scanner;

public class light {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int light = scan.nextInt();

        int cnt = 0;
        for(int i = 1; i<=light;i++){
            if(light%i == 0) cnt++;
        }
        if(cnt % 2 != 0) System.out.println("yes");
        else System.out.println("no");

    }
}
