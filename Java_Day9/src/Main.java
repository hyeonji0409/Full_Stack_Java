// '*'(와일드카드), all 이라는 의미로 사용
// 동일한 패키지라면 모두 import 해서 사용 가능

import StartJava.animal.birds.Birds;
import StartJava.animal.ground.*;

// 라이브러리(개발에 필요한 유용한 클래스를 미리 만들어서 제공
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Birds bird = new Birds();
        Ground ground = new Ground();
    }
}
