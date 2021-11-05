package Basic_Java;

import java.util.Scanner;
/*
소수찾기 3단계
 */
public class Loop13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요: ");
        int n = scan.nextInt();

        while (true) {
            int cnt = 0;
            for(int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    cnt++;
                }
            } //for

            if (cnt == 2) {
                System.out.println(n);
                break;
            }
            n++;
        }

    }
}
