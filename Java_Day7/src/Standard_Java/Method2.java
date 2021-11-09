package Standard_Java;

class Person1 {
    static int share = 10;

    String name;
    int age;

    void info() {
        System.out.printf("이름: %s, 나이: %d\n", name, age);
    }

    // 속성을 정의하는 메서드 추가
    // 메서드의 이름 앞에 set을 붙여서 표현 . setter
    public void setName(String name) {
        // 둘 다 지역변수의 name
        // 지역변수와 객체변수가 이름이 동일하면 지역변수가 우선
//        name = name;
        System.out.println("this: "+this);
        
        this.name = name;
    }
}

public class Method2 {
    public static void main(String[] args) {

        Person1 p1 = new Person1();
        Person1 p2 = new Person1();

        p1.setName("김준면");
        System.out.println("p1: "+p1);
//        p1.age = 31;

        p2.setName("김민석");
        System.out.println("p2: "+p2);
//        p2.age = 32;
//
//        p1.info();
//        p2.info();


    }
}
