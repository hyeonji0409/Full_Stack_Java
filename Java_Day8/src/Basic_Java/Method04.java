package Basic_Java;

import java.util.*;

class Ex04 {

    int test1( int [] arr ) {

        int cnt = 0;

        for ( int val : arr ) {
            if( val % 4 == 0) cnt++;
        }

        return cnt;
    }

    // 참조형을 리턴?
    // 값이 아닌, 값이 들어있는 메모리의 위치를 돌려준다.
    int [] test2( int cnt, int [] arr ) {

        // 4의 배수를 저장할 새로운 배열을 생성
        // 배열의 위치를 참조하는 참조 변수가 지역변수
        int [] newArr = new int[cnt];

        // arr를 순회하면서, newArr의 위치를 잘 잡아줘야 합니다.
        int i = 0;
        for  ( int val: arr) {
            if( val % 4 == 0) {
                newArr[i] = val;
                i++;
            }
        }

        return newArr;
    }
}


public class Method04 {
    public static void main (String [] args) {

        int[] arr = {87, 12, 21, 56, 100};

        Ex04 e = new Ex04();

        int cnt = e.test1(arr); // 실제 전달되는 값은 배열이 아닌
        // 배열의 위치가 전달

        System.out.println("cnt = " + cnt);

        // 문제 2) 4의 배수의 개수만큼의 새로운 배열을 만들고, 4의 배수를 저장후 배열을 리턴해주는 메서드
        int [] temp = e.test2(cnt, arr);
        System.out.println(Arrays.toString(temp));

    }
}
