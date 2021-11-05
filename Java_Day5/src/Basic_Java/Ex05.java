package Multi_Cam;

import java.util.Scanner;

/*
구구단 게임
숫자 2개 입력받아
입력 받은 숫자 토대로 구구단 문제 출력
 */
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, answer, myanswer;

        System.out.println("첫 번째 숫자 입력: ");
        x = sc.nextInt();
        System.out.println("두 번째 숫자 입력: ");
        y = sc.nextInt();

        System.out.println(x + " x " + y + " = ?" );

        answer = x*y;

        System.out.println("정답 입력: ");
        myanswer = sc.nextInt();
        
        if (myanswer == answer) {
            System.out.println("정답입니다");
        }
        else{
            System.out.println("틀렸습니다");
        }
    }
}
