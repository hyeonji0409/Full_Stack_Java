package Standard_Java;

// 간단한 클래스를 정의
// 수업시간에는 사람 이라는 클래스를 정의
// 객체를 살아있는 생물이나, 물건처럼 취급
// 사람을 모델로 해서 클래스를 정의
class Person {
    // 변수를 정의(사람에 대한 속성)
    // 사람이라면, 누구나 가지는 속성

    // 클래스 변수(정적변수)
    static int share = 10;

    // 객체 변수(인스턴스 변수)
    String name;
    int age;

    void method() {
        int a = 10;
        a++;
        System.out.println(a);
    }
}

public class Chapter6_Class {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Person p1 = new Person();
        Person p2 = new Person();

        // .을 통해서 접근(객체의 속성에 접근)
        // 객체.속성
        // 객체.기능()
        p1.name = "김준면";
        p1.age = 20;
        System.out.printf("이름: %s, 나이: %d\n", p1.name, p1.age);

        // 서로 다른 객체 입니다.
        // 객체변수는 공유되지 않습니다.
        System.out.printf("이름: %s, 나이: %d\n", p2.name, p2.age);

        System.out.println(++p1.share);
        System.out.println(p2.share);


        // 객체내의 메서드를 호출하는 경우에도 동일하게 .으로 접근
        p1.method();
        p2.method();

        // 메서드내에 정의된 변수 a는 접근할 수 없습니다.
        // p1.a;
    }
}