package Standard_Java;

import java.util.Arrays;

public class Ndim {
    public static void main(String[] args) {
        // 2차원 배열 선언
        int[][] arr = new int[5][5];

        // 초기화된 2차원 배열의 선언
        // 배열의 원소로 배열을 갖는 형태
        // 문자원 배열도 2차원 배열과 동일한 형태
        int[][] arr2D = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        // 2차원 배열에서 원소에 대한 참조
        // {1,2,3,4} 출력
        System.out.println(Arrays.toString(arr[0]));
        // 0번 행의 1번째 값 => 2 출력
        System.out.println(arr[0][1]);

        // 2차원 배열 순회
        for(int i = 0; i<arr2D.length;i++){
            System.out.println(Arrays.toString(arr2D[i]));
            for(int j = 0; j< arr2D[i].length;j++){
                System.out.println(arr2D[i][j]);
            }
        }
    }
}
