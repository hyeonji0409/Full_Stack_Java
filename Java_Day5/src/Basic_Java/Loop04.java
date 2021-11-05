package Basic_Java;

import java.util.Random;
import java.util.Scanner;
/*
랜덤값 받아서 Up & Down 게임!
틀릴 때마다 5점씩 차감
 */
public class Loop04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int answer = 0;
        int com = rand.nextInt(101);
        int score = 100;

        while(true) {
            System.out.println("숫자를 입력해주세요: ");
            answer = sc.nextInt();
            if(answer < com){
                System.out.println("Up!");
                score -= 5;
            }
            else if(answer > com){
                System.out.println("Down!");
                score -= 5;
            }
            else{
                break;
            }
        }
        System.out.println("최종 점수는: "+score+"점 입니다");
    }
}
