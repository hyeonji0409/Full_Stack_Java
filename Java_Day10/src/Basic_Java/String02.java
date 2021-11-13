package Basic_Java;

import java.util.Arrays;

public class String02 {
    public static void main(String[] args) {

        // 문제1) /를 기준으로 문자열을 int형 배열에 저장, 성적의 총 합 구하기기
       String str = "11/100/89";
        int[] arr = new int[3];
        int total = 0;

        String[] score = str.split("/");
        for(int i = 0; i < score.length; i++){
            arr[i] = Integer.parseInt(score[i]);
            total += arr[i];
        }
        System.out.println("총점: "+total);


        // 문제2) scores 배열의 각 점수를 슬러시를 구분자로 하여 하나의 문자열로 생성
        int[] scores = {11,100,89};
        String text = "";

        // 문자열 타입으로 변환
        // score과 같은 크기의 문자열 배열 생성
        String[] strScore = new String[scores.length];
        for(int i = 0; i< scores.length;i++){
            strScore[i] = Integer.toString(scores[i]);
        }

        System.out.println(String.join("/", strScore));
    }
}
