package Basic_Java;
/*
ATM 이체하기
 */
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int account = 1234;
        int myMoney = 9876;
        int yourMoney = 12000;

        int amount = 0;
        int InputAccount;

        System.out.println("계좌번호를 입력하세요: ");
        InputAccount = sc.nextInt();
        
        if(account == InputAccount){
            System.out.println("이체할 금액을 입력하세요");
            amount = sc.nextInt();
            if(amount <= myMoney){
                myMoney -= amount;
                yourMoney += amount;
            }
            else{
                System.out.println("잔액이 부족합니다.");
            }
        }
        else {
            System.out.println("계좌번호를 확인해주세요");
        }

        System.out.println("입금이 완료되었습니다.");
        System.out.println("내 계좌 잔액 :"+myMoney+" 원");
        System.out.println("상대방 계좌 잔액 :"+yourMoney+" 원");
    }
}
