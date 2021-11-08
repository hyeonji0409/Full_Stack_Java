package Basic_Java;

import java.util.Scanner;

public class Array09_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10,20,30,40,0};
        int cnt = 2;


        // 값을 입력받아서 배열이 비어 있다면 추가
        while(true){
            System.out.print("삽입할 값 입력: ");
            int val = sc.nextInt();

            System.out.print("삽입할 위치 입력: ");
            int idx = sc.nextInt();

            int insIdx = 0;
            for(int i=arr.length-1; i > idx; i++){
                arr[i] = arr[i-1];
            }
           arr[idx] = val;
//            삭제 연산
//            int delIdx=0;
//            for(int i=0; i<arr.length;i++){
//                if(val==arr[i]) {
//                    delIdx = i;
//                }
//            }
//
//            for(int i = delIdx; i<arr.length-1;i++){
//                arr[i] = arr[i+1];
//            }


            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }// for
            System.out.println();
        }

    }
}
