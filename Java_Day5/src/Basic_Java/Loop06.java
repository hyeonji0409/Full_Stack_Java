package Basic_Java;

import java.util.Scanner;

/*
에라토스테스의 체와 같은 더 쉽게 소수를 찾을 수 있는 방법이 있으나
반복문을 익히기 위한 예제
 */
public class Loop06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        System.out.println("숫자를 입력하세요: ");
        int num = sc.nextInt();

        for(int i = 1; i<= num; i++){
            if(num % i == 0){
                cnt += 1;
                continue;
            }
        }
        if(cnt == 2){
            System.out.println("입력받은 값은 소수입니다.");
        }
        else {
            System.out.println("입력한 값은 소수가 아닙니다.");
        }
    }
}
