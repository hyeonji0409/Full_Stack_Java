package Standard_Java;

interface Interface{
    public abstract void abstractMethod1();
    public abstract void abstractMethod2();
    public abstract void abstractMethod3();
}

// 인터페이스의 상속은 extends가 아닌, implements로 상속이 됨
// 여러 개의 인터페이스 상속 받아서 구현
// 자바는 다중 상속 허용하지 않지만, 하나의 클래스(일반, 추상) 여러개의 인터페이스는 가능
class Sample implements Interface{
    public void abstractMethod3() {};
    public void abstractMethod1() {};
    public void abstractMethod2() {};
}

public class InterfaceTest {
    public static void main(String[] args) {
        Sample s = new Sample();
    }
}
