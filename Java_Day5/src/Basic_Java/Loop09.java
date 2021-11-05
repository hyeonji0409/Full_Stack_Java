package Basic_Java;

import java.util.Random;
/*
1. 10회 반복
2. 1~100 사이의 랜던 숫자 저장
3. 성적이 60점 이상이면 합격
-----------------------------
전교생 10명의 총점과 평균 출력
합격자 수 출력
1등 학생의 번호와 성적 출력
 */

public class Loop09 {
    public static void main(String[] args) {
        Random rand = new Random();
        int cnt = 0;
        int total = 0;
        int maxNum = 0;
        int maxScore = 0;

        for(int i=1;i<=10;i++){
            int score = rand.nextInt(100) +1;
            maxScore = 0;
            maxNum = 0;
            if(score >= 60){
                cnt ++;
                total += score;
            }
            if(maxScore<score){
                maxScore = score;
                maxNum = i;
            }
        }
        System.out.println("전교생의 총점은: "+total+"점 이고, 평균은: "+((float)total/10)+"점 입니다.");
        System.out.println("합격자 수는: "+cnt+"명 입니다.");
        System.out.println("1등 학생의 번호는: "+maxNum+"번 이고, 성적은: "+maxScore+"점 입니다.");
    }
}
