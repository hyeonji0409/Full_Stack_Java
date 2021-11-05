package Basic_Java;

import java.util.Scanner;

/*
구구단 게임[3단계]
 */
public class Loop02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, answer, myanswer;
        int score = 0;

        for (int i=1;i<=5;i++){
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.printf("%d x %d = ? \n", x, y);
            answer = x*y;
            System.out.print("정답을 입력하세요: ");
            myanswer = sc.nextInt();
            if(answer == myanswer){
                System.out.println("정답입니다");
                score +=20;
            }
            else {
                System.out.println("다시 생각해보세요");
            }
        }
        System.out.println("총 점수는 "+score+"점 입니다.");
    }
}
