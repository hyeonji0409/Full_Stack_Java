package Basic_Java;

import java.util.Arrays;

public class String04 {
    public static void main(String[] args) {

        // 문제1) 이름과 성적을 하나의 문자열로 연결

        String[] name = {"김철수", "이민수", "이영희"};
        int[] score = {87,42,95};

        String str = "";

        String[] temp = new String[name.length];

        for(int i = 0; i<name.length;i++){
            temp[i] = String.format("%s/%s", name[i], score[i]);
        }
        System.out.println(Arrays.toString(temp));
    }
}
