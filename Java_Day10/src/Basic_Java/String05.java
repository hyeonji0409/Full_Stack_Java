package Basic_Java;

import java.util.Arrays;
import java.util.Collections;

public class String05 {
    public static void main(String[] args) {
        // 사전순으로 정렬
        String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
