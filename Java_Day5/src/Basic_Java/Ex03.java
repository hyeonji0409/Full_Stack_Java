package Basic_Java;

import java.util.Scanner;

/*
 로그인[1단계]
 ID PW 일치하면 로그인 성공입니다
 하나라도 틀리면 로그인 실패 출력
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dbID = 1234;
        int dbPw = 1111;

        System.out.printf("ID 입력: ");
        int myId = sc.nextInt();
        System.out.printf("PW 입력: ");
        int myPw = sc.nextInt();
        
        if(dbID == myId && dbPw == myPw){
            System.out.println("로그인 성공");
        }
        else{
            System.out.println("로그인 실패");
        }
    }
}
