package Basic_Java;

import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hakbuns = {1001,1002,1003,1004,1005};
        int[] scores = {87,11,45,98,23};

        System.out.println("학번 입력: ");
        int hakbun = sc.nextInt();
        int idx=0;
        int i = 0;
//        boolean flag = true;
        for(i=0;i<hakbuns.length;i++){
            if(hakbuns[i]==hakbun){
                System.out.println(scores[i]);
//                flag = false;
                break;
            }
        }
        if(i>=hakbuns.length){
            System.out.println("해당 학번은 존재하지 않습니다.");
        }
    }
}
