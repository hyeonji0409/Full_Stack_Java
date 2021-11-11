package Basic_Java;

import java.util.Random;

//class Account{
//    int accountNum = 0;
//    int money = 0;
//}

class User {
    String userId;
    String accountNumber;
    int balance;

    // 생성자 추가
    User() {
        this.accountNumber = create_AccountNum();
        this.balance = 0;
    }

    // 생성자 오버로딩(이름은 같고, 매개변수는 다르게)
    User(int amount){
        this.accountNumber = create_AccountNum();
        this.balance = amount;
    }

    private String create_AccountNum(){
        Random rand = new Random();
        String account = String.format("%04d-%04d-%04d-%04d",
                rand.nextInt(9999)+1,
                rand.nextInt(9999)+1,
                rand.nextInt(9999)+1,
                rand.nextInt(9999)+1);
        return account;
    }

    // 고객 정보 출력
    // 현재 고객의 계좌번호와 잔액 출력하는 메서드 정의
    void printAccountInfo() {
        System.out.println("계좌번호: "+this.accountNumber+", 잔액: "+this.balance);
    }

    // 입/출금 기능 추가
    void deposit(int amount) {
        this.balance += amount;
    }

    void withdraw(int amount){
        if(this.balance < amount){
            System.out.println("잔액이 부족합니다");
        }
        else{
            this.balance -= amount;
        }
    }
}

// User의 기능을 확장 => 신용 대출
class UserEx extends User{
    // 잔액이 부족해도 출금이 가능하도록

    // 신용등급 추가
    int creditLevel = 0;
    int depositCnt = 0;

    // 메서드 오버라이딩
    // 거래량(입금횟수)에 따라 신용등급 -> Level 1씩 증가 -> deposit 오버라이딩
    void deposit(int amount){
        super.deposit(amount);
        // 추가된 기능 정의
        this.depositCnt++;
        if(this.depositCnt % 5 == 0) creditLevel++;
    }

    // 메서드 오버라이딩
    // 부모 클래스의 메서드 이름과 동일
    void withdraw(int amount){
        if(this.balance < amount && this.creditLevel > 10) this.balance -= amount;
        else if(this.balance < amount && this.creditLevel <= 10) System.out.println("잔액이 부족합니다.");
        else balance -= amount;
    }

    // 메서드 오버라이딩
    void printAccountInfo(){
        super.printAccountInfo();
        System.out.printf("신용등급: %d, 입금횟수: %d", this.creditLevel, this.depositCnt);
        System.out.println();
    }
}

public class ClassVsInstance03 {
    public static void main(String[] args) {
        Random rand = new Random();
        User[] userList = new User[4];

        for(int i = 0; i<userList.length;i++){
            userList[i] = new User(rand.nextInt(999999)+1);
            userList[i].printAccountInfo();
        }

        // 첫 번째 고객의 입금
        userList[0].deposit(10000);
        userList[0].printAccountInfo();

        // 두 번째 고객 출금
        userList[1].withdraw(10000);
        userList[1].printAccountInfo();

        // 확장된 고객 객체 생성
        // 생성자는 상속되지 않음
        // UserEx는 기본 생성자가 동작
        UserEx user01 = new UserEx();
        user01.printAccountInfo();

         int money = 0;
        for(int i = 1; i<12;i++){
            money = rand.nextInt(9999)+1;
            user01.deposit(money);
        }

        // 마이너스 인출
        user01.withdraw(10000);
        user01.printAccountInfo();
    }
}
