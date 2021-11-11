package Standard_Java;

class Tv{
    boolean power;
    int channel;

    // True or False
    void power(){ power = !power; }
    void channelUp(){ channel++; }
    void channelDown() { channel--; }
}

// 자바는 다중 상속을 지원하지 않음 (여러 개의 클래스를 상속받을 수 없음)
class CaptionTv extends Tv{
    // 자식 클래스에서 새로 추가된 속성
    String text;

    void caption(){ }
}

class Other{

}

// java 파일 하나당 하나의 public 클래스 가질 수 있음
public class PolymorphismTest {
    public static void main(String[] args) {
        // is-a 관계. 즉, 상속 관계에서만 사용 가능
        // CaptrionTv is Tv
        Tv t1 = new Tv();
        Tv t2 = new CaptionTv();

        // 상속되지 않은 Other을 사용하면 오류가 나는 것 확인 가능
        // 참조변수와 객체의 타입이 다르면 안됨
//      Tv t3 = new Other();
        CaptionTv c = new CaptionTv();

        // Tv는 CaptionTv이다는 성립하지 않음
        // 모든 학생은 사람이지만, 모든 사람이 학생일 수는 없다는 의미
//      CaptionTv c2 = new Tv();

        t2.power();
        t2.channelUp();
        // Tv 타입의 참조형 변수는 자식 타입의 속성 까지는 알 수 없음
//      t2.text;
        c.power();
        c.channelDown();
        c.text = "Unknown";

        // Tv 타입만을 원소로 가질 수 있음
        Tv[] arrT = new Tv[10];
    }
}