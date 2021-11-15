package Goorm;

import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int total = 0;
        for(int i = 0; i<num; i++){
            total += i;
            if(total >num) {
                System.out.println(i);
                break;
            }
        }
    }
}
