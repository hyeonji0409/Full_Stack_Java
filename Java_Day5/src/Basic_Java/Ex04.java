package Basic_Java;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dbId, dbPw;
        int myId, myPw;

        System.out.println("==== 회원가입 ====");
        System.out.println("dbID 입력: ");
        dbId = sc.nextInt();
        System.out.println("dbPW 입력: ");
        dbPw = sc.nextInt();

        System.out.println("==== 로그인 ====");
        System.out.println("myId 입력: ");
        myId = sc.nextInt();
        System.out.println("myPw 입력: ");
        myPw = sc.nextInt();

        if(dbId == myId && dbPw == myPw){
            System.out.println("로그인 성공");
        }
        else{
            System.out.println("로그인 실패");
        }

    }
}
