package Multi_Cam;

import java.util.Scanner;

/*
로그인 [3단계]
id 입력받아 db와 같은지 확인하기
같으면 pw 입력받기
같지 않다면 id를 확인해주세요 메시지 출력
pw가 맞다면 로그인 성공
pw가 일치하지 않다면 로그인 실패 출력
 */

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dbId, dbPw, myId, myPw;
        dbId = 1234;
        dbPw = 1111;

        System.out.println("myId를 입력하세요");
        myId = sc.nextInt();

        if(dbId == myId){
            System.out.println("myPw를 입력하세요");
            myPw = sc.nextInt();
            if(dbPw == myPw){
                System.out.println("로그인 성공");
            }
            else {
                System.out.println("로그인 실패");
                System.out.println("Pw를 확인해주세요");
            }
        }
        else{
            System.out.println("Id를 확인해주세요");
        }

    }
}
