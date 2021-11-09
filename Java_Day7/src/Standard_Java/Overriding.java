package Standard_Java;

class Person3 {
    static int share2 = 10;

    String name;
    int age;

    // 생성자 오버로딩
    // 기본 생성자느 아무것도 하지 않음
    Person3() {

    }

    Person3(String name, int age){
        this.name = name;
        this.age = age;
    }

    static void get_share() {
        System.out.println(share2);
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
class Student extends Person2 {
    String school;
    // 생성자는? -> 상속되지 않음
    // 생성자를 정의하지 않으면?
    // -> default 생성자가 존재하게 됨 (아무것도 하지 않는 기본 생성자)

    Student() { };
    Student(String name, int age, String school){
        //super(name, age); // 부모 클래스의 생성자를 직접 호출
        this.name = name;
        this.age = age;
        this.school = school;
    }


    // info() 메서드를 재정의 한다면
    void info() {
        System.out.println("이 메서드는 재정의 되었습니다");
        // 부모 클래스의 메서드를 사용하고 싶다면?
        // super: 부모, super.속성
        // super(): 부모 클래스의 생성자
        // this: 객체 자기 자신
        super.info();
        System.out.printf("학교이름: %s\n", this.school);
    }
}

public class Overriding {
    public static void main(String[] args){
        Student s1 = new Student("김준면", 20, "multicampus");
        s1.info();
    }
}