package Basic_Java;

import java.util.Scanner;

/*
최댓값 구하기
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3;
        int max = 0;
        System.out.println("n1 입력: ");
        n1 = sc.nextInt();
        System.out.println("n2 입력: ");
        n2 = sc.nextInt();
        System.out.println("n3 입력: ");
        n3 = sc.nextInt();

        max = n1;
        if(max < n2){
            max = n2;
        }
        if(max < n3){
            max = n3;
        }
        System.out.println("최대값: "+max);
    }
}
