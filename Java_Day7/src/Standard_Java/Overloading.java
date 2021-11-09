package Standard_Java;

class Person2 {
    static int share1 = 10;

    String name;
    int age;

    // 생성자 오버로딩
    Person2() {

    }

    Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    static void get_share() {
        System.out.println(share1);
    }

    void info() {
        System.out.printf("이름: %s, 나이: %d\n", this.name, this.age);
    }

    void set_naem(String name){
        this.name = name;
    }

    String get_name() {
        return this.name;
    }

}

// Person 클래스를 상속받음
class Student1 extends Person2 {
    // 입력되는 수가 없어도, 혹은 1개여도, 3개여도 동작하려면?
    // 메서드 이름이 같아도, 파라미터 갯수가 다르기 때문에 각각을 다르게 사용할 수 있다.
    int add(){
        return 10+20;
    }
    int add(int a){
        return a+20;
    }
    int add(int a, int b){
        return a+b;
    }
    /*
    변수가 다르더라도 파라미터의 갯수가 같기 때문에 구분이 불가능하다.
    int add(int c, int d){
        return c+d;
    }
    */
    // 파라미터의 갯수는 같지만, 타입이 int와 String으로 다르기 때문에 구분 가능
    String add(String a, String b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class Overloading {
    public static void main(String[] args){
        Student1 s1 = new Student1();

        System.out.println(s1.add());
        System.out.println(s1.add(10));
        System.out.println(s1.add(10,20));
        System.out.println(s1.add("Hello ", "Java"));
        System.out.println(s1.add(10,20,30));

        // 생성자 오버로딩을 이용하면 객체를 다양하게 생성 가능
        Person2 p1 = new Person2();
        p1.info();

        Person2 p2 = new Person2("김준면", 31);
        p2.info();
    }
}