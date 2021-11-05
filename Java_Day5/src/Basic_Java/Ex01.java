package Basic_Java;
import java.util.Scanner;

/*
Up& Down 게임
1. com = 8
2. me는 com의 숫자를 맞추는 게임
3. 다음과 같은 메시지 출력
3-1. me < com : Up
3-2. me == com : Bingo
3-3. me > com: Down
*/

public class Ex01 {
    public static void main(String[] args) {
        int com = 8;
        Scanner sc = new Scanner(System.in);

        int me = sc.nextInt();

        if(me < com) {
            System.out.println("Up!");
        }
        else if(me == com){
            System.out.println("Bingo!");
        }
        else {
            System.out.println("Down!");
        }
    }
}
