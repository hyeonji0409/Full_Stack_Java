package Standard_Java;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main( String [] args ) {
        // 객체 생성
        ArrayList arr = new ArrayList();

        // 원소를 추가 하는 방법(add)
        arr.add("10");
        arr.add("20");
        arr.add("30");

        // 배열의 내의 원소를 확인(get)
        System.out.println(arr.get(0));

        // 배열의 크기를 확인하고 싶은 경우(size)
        System.out.println(arr.size());

        // 배열에 원소를 삽입하는 경우(add)
        arr.add(1, "15");

        // 배열내의 모든 원소를 확인하고 싶은 경우에는 순회
        for( int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        // 배열의 원소를 검색하는 경우
        System.out.println( arr.contains("15"));

        // 배열에서 원소를 삭제하는 경우(remove)

        // 매개변수가 객체인 경우(기본타입이 아닌 경우)
        arr.remove("10");
        for( int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        System.out.println();

        // 매개변수가 숫자(인덱스)인 경우

        arr.remove(1);
        for( int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}