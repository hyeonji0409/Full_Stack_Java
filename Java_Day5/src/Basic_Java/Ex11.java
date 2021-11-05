package Basic_Java;

import java.util.Random;
import java.util.Scanner;

/*
코인게임
 */
public class Ex11 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int ans = 0;
        int coin = rand.nextInt(2); // 0 ~ 1, 1 ~ 100: radn.nextInt(100) + 1

        System.out.print("동전의 앞면(0), 뒷면(1) 입력: ");
        ans = scan.nextInt();

        if ( coin == 0 ) { System.out.println("앞면"); }
        else { System.out.println("뒷면"); }

        if ( coin == ans) { System.out.println("정답!"); }
        else { System.out.println("땡!!!"); }
    }
}
