package Standard_Java;

abstract class Abstract{
    // 선언만 되어있고, 내부의 기능이 정의되지 않은 메서드
    abstract void abstractMethod();
    
    // 정의된 메서드가 있어도 무관함
    void generalMethod() {
        System.out.println("일반 메서드");
    }
}

abstract class General extends Abstract{

}

// 언젠가는 구현되어야 함
class Final extends General{
    // 메서드 재정의(오버라이드) 통해서 완성
    void abstractMethod() {
        System.out.println("이제는 완성");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        
        Abstract obj = new Final(); // 인스턴스화 할 수 없다는 오류 발생
        
    }
}
