package Basic_Java;

/*
문자열 속 숫자검사

1. 문자만 있다

2. 숫자만 있다

3. 문자와 숫자가 섞여있다.

 */

import java.util.Scanner;

public class String06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("입력: ");
        String text = scan.next();

        int numberCnt = 0;
        for(int i = 0; i<text.length();i++){
            char ch = text.charAt(i);
            if(ch >= 0x30 && ch <= 0x39) numberCnt++;
        }

        if(numberCnt == 0) System.out.println("문자만 있는 경우");
        else if(numberCnt == text.length()) System.out.println("숫자만 있는 경우");
        else System.out.println("숫자와 문자가 모두 있는 경우");
   }
}
