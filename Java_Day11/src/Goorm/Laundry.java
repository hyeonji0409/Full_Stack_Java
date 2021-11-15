package Goorm;

import java.util.Scanner;

public class Laundry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        String[] colors = scan.nextLine().split(" ");
        int[] a = new int[m/2]; //짝수번
        int[] b = new int[m/2]; //홀수번

        int laundry = 0;
        for(int i = 0; i<m; i++){
            int time = scan.nextInt();
            String color = scan.next();
            if(m%2 == 0){
                a[i] = time;
            }
            else{
                b[i] = time;
            }
            laundry += time;
        }
    }
}
