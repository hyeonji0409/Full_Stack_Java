package Standard_Java;

import java.util.Arrays;

public class Parameter {
    // 기본형 매개변수 예제
    static void primitive_method(int a, int b){
        System.out.println("BEFORE a: "+ a+", b: "+b);
        int tmp = b;
        b = a;
        a = tmp;
        System.out.println("AFTER a: "+ a+", b: "+b);
    }

    //참조형 매개변수 예제
    static void reference_method(int[] arr){
        // 전달받은 배열에 변화
        Arrays.sort(arr);
        System.out.print("sub method: ");
        System.out.println(Arrays.toString(arr));

    }

    // 참조형 반환이 있는 메서드를 정의
    static int[] sub(int n){
        // 전달받은 n의 크기의 배열을 생성, 전달
        int[] arr  =new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }

        // 배열을 반환
        return arr;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        primitive_method(10,20);

        // main 메서드의 a,b는 primitive_method의 영향을 받지 않음
        System.out.println("MAIN "+a+" "+b);

        int[] arr = {3,4,2,1,7,6};
        System.out.print("함수 호출 전: ");
        System.out.println(Arrays.toString(arr));
        reference_method(arr);

        // primitive와 달리 main 함수에서 영향을 받았다는 것을 확인 가능
        System.out.print("함수 호출 후: ");
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(sub(10)));

        int[] ret = sub(5);
        System.out.println(Arrays.toString(ret));

        int[] arr2 = arr;

    }
}
