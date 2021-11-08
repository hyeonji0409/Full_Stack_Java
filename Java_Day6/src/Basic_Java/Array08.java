package Basic_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Array08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] arr = new char[3][3];

        int x, y;

        for(int i=0; i< 3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = ' ';
            }
        }
        while(true){
            for(int i=0; i<3; i++){
                System.out.println(" "+ arr[i][0] + "| " + arr[i][1]+"| "+ arr[i][2]);
                if(i != 2){
                    System.out.println("--|--|--");
                }
            }

            System.out.println("다음 수의 좌표를 입력하시오: ");
            x = scanner.nextInt();
            y = scanner.nextInt();

            if(arr[x][y] != ' '){
                System.out.println("잘못된 위치입니다.");
                continue;
            }
            else{
                arr[x][y] = 'X';
            }

            // 컴퓨터가 놓은 위치 결정
            int i = 0, j=0;
            outer :
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    if(arr[i][j]==' '){
                        break outer;
                    }
                }
            }
            if(i<3 && j<3){
                arr[i][j] ='O';
            }
        }



    }
}
