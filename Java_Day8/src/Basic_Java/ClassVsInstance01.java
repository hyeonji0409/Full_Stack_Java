package Basic_Java;

import java.util.Scanner;

// 사람을 모델로 해서 클래스 정의
// Person 클래스 정의
class Person{

    private int age; // 나이속성 private으로 정의

    // 나이 속성을 초기화하는 생성자 정의
    // 생성자의 매개변수는 initialAge
    // 생성자는 어디에서나 접근할 수 있도록 정의
    public Person(int initialAge) {
        this.age = initialAge;
    }

    // 나이를 체크하는 메서드 정의
    // 매개변수와 돌려주는 값이 없는 메서드 정의
    // 어디에서나 접근할 수 있도록 정의
    public void amIOld(){
        if(this.age<10){
            System.out.println("어리군요");
        }
        else if(this.age>=10 && this.age<20){
            System.out.println("10대군요");
        }
        else if(this.age >= 20){
            System.out.println("성인이시군요");
        }
    }

    // 나이 속성을 하나씩 증가시켜주는 메서드 yearPasses 정의
    // 돌려주는 값은 없고, 매개변수를 갖지 않음
    // 어디에서나 접근 가능하도록 정의
    // 나이 속성을 1 증가시키기
    public void yearPasses(){
        this.age++;
    }

}

public class ClassVsInstance01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i = 0; i< T; i++){ // 입력된 t만큼 반복
            int age = sc.nextInt(); // 나이 입력받기
            Person p = new Person(age);
            p.amIOld(); // 현재 나이 출력
            for(int j = 0; j<3;j++){ //3년이 지난 후
                p.yearPasses();
            }
            p.amIOld(); //3년 후의 나이
            System.out.println();
        }

    }
}