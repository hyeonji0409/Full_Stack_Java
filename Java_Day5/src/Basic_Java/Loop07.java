package Basic_Java;

import java.util.Scanner;
/*
최댓값 구하기
 */
public class Loop07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        int max;

        for(int i = 0; i<=3; i++){
            System.out.println("세 수를 입력하세요");
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            max = x;
            if(max<y){
                max = y;
            }
            if(max < z){
                max = z;
            }
            System.out.println("최댓값은: "+max+"입니다.");
        }

    }
}
