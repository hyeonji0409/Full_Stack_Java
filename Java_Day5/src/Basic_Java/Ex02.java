package Basic_Java;

import java.util.Scanner;
/*
 가위바위보 게임!!
 com = 1
 가위: 0
 바위: 1
 보: 2
 */
public class Ex02 {
    public static void main(String[] args) {
        int com = 1;
        Scanner sc = new Scanner(System.in);

        int me = sc.nextInt();

        if(com == me){
            System.out.println("비겼다");
        }
        else if(com < me){
            System.out.println("내가 이겼다");
        }
        else {
            System.out.println("내가 졌다");
        }
    }
}
