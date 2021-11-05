package Basic_Java;

import java.util.Scanner;

public class Loop03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while(true){
            System.out.println("숫자 입력[EXIT:-100]");
            num = sc.nextInt();
            if(num == -100){
                break;
            }
        }

    }
}
