package Basic_Java;

import java.util.Scanner;

/*
소수찾기 2단계
정수 한 개 입력받아 2부터 해당 숫자까지의 모든 소수 출력
 */
public class Loop08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            int cnt=0;
            for(int j=1;j<=i;j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if(cnt == 2){
                System.out.print(i+" ");
            }
        }
    }
}
