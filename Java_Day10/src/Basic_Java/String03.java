package Basic_Java;

import java.util.Arrays;

public class String03 {
    public static void main(String[] args) {
        // 문제1) 이름은 name 배열에, 성적은 score 배열에 각각 저장 및 출력

        String str = "김철수/87,이만수/42,이영희/95";

        String[] name = new String[3];
        int[] score = new int[3];

        String[] person =  str.split(",");
        for(int i = 0; i < person.length;i++){
            String[] person2 = person[i].split("/");
            name[i] = person2[0];
            score[i] = Integer.parseInt(person2[1]);
        }

        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(score));

    }
}
