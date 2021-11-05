package Multi_Cam;

import java.util.Random;
import java.util.Scanner;

/*
코인게임
 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int coin = rand.nextInt(2);
        System.out.println(coin);
        if(coin == 1){
            System.out.println("앞면입니다");
        }
        else {
            System.out.println("뒷면입니다");
        }
    }
}
