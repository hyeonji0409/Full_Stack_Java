package Basic_Java;

import java.util.Scanner;

public class Array09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10,20,0,0,0};
        int cnt = 2;

        // 값을 입력받아서 배열이 비어 있다면 추가
        while(true){
            System.out.println("추가할 값 입력: ");
            int val = sc.nextInt();

            if(cnt < arr.length){
                arr[cnt] = val;
                cnt++;
            }
            else{
                System.out.println("더 이상 입력할 수 없습니다.");
                break;
            }

            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }// for
            System.out.println();
        }

    }// while
}
