package Basic_Java;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {87,11,45,98,23};
        int[] hakbuns = {1001,1002,1003,1004,1005};
        int[] scores = {86,54,89,97,50};
        int index, score, hakbun;


        System.out.print("인덱스 번호 입력: ");
        index = scan.nextInt();
        System.out.println(arr[index]);

        System.out.print("성적 입력: ");
        score = scan.nextInt();
        for(int i=0; i<arr.length;i++){
            if(score==arr[i]){
                System.out.println(i);
                break;
            }
        }

        System.out.print("학번 입력: ");
        hakbun = scan.nextInt();
        for(int i=0; i<hakbuns.length;i++){
            if(hakbuns[i]==hakbun){
                System.out.println(scores[i]);
                break;
            }
        }
        System.out.println(scores[hakbun]);


    }
}
