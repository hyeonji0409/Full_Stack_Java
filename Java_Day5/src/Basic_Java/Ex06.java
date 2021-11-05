package Basic_Java;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int score;

        Scanner sc = new Scanner(System.in);

        System.out.println("성적을 입력하세요: ");
        score = sc.nextInt();

        if(score >= 60 && score <=100){
            System.out.println("합격");
        }
        else if(score < 60 && score >= 0){
            System.out.println("불합격");
        }
        else{
            System.out.println("성적을 잘못 입력했습니다. 다시 입력하십시오.");
        }

    }
}
