package Standard_Java;

import java.util.ArrayList;

public class Generics01 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        
        // 원소의 타입이 String임을 알고 있음
        arr.add("Java");
        arr.add("Python");
        arr.add("C++");
        
        // 객체에 들어갈 타입을 명시해주는 것
        ArrayList<String> arr1 = new ArrayList();
        
        arr1.add("Java");
        arr1.add("Python");
        arr1.add("C++");
        
        // 별도의 타입 체크가 필요 없음
        String str = arr1.get(0);
        System.out.println(str);
        
    }
}
