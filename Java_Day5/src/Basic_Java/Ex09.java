package Basic_Java;
/*
메뉴판 입력받기
 */
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice, money;

        int price1 = 8700;
        int price2 = 6200;
        int price3 = 1500;
        int charge = 0;

        System.out.println("==== 롯데리아 ====");
        System.out.println("1. 불고기 버거 : " + price1 + "원");
        System.out.println("2. 세우   버거 : " + price2 + "원");
        System.out.println("3. 콜      라 : " + price3 + "원");

        System.out.println("메뉴를 선택하세요: ");
        choice = sc.nextInt();
        System.out.println("금액을 선택하세요: ");
        money = sc.nextInt();

        if(choice == 1){
            charge = money - price1;
        }
        else if(choice == 2){
            charge = money - price2;
        }
        else if(choice == 3){
            charge = money - price3;
        }
        else{
            System.out.println("메뉴판에 없는 메뉴입니다. 다시 확인 바랍니다");
        }

        if(charge >= 0) {
            System.out.println("잔돈은 " + charge + "원 입니다");
        }
        else{
            System.out.println("현금이 부족합니다.");
        }

    }
}
