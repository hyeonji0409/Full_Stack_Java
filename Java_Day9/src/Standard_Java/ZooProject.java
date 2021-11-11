package Standard_Java;

/*
1. 동물원 클래스 가정
2. 호랑이가 들어오면 닭을 먹이로 주고
3. 원숭이가 들어오면 바나나를 먹이로 주고 ..
 */

// 동물 클래스 정의
class Animal{
    String name;

    public void setName(String name){
        this.name = name;
    }
}

// 동물이 계속 추가된다면??
interface Ground{

}

//interface Birds {
//    // 날지 못하는 새 처리 위함
//    public String getAction();
//}

abstract class Birds extends Animal{
    public abstract String getAction();

    public void getName() {
        System.out.printf("너의 이름은 %s\n", this.name);
    }
}

interface Foodable{
    public void food();
}

interface GroundFoodable extends Ground, Foodable{

}

// 호랑이 클래스(동물 클래스 상속)
class Tiger extends Animal implements GroundFoodable{
    public void food() {
        System.out.println("닭");
    }
}
// 원숭이 클래스(동물 클래스 상속)
class Monkey extends Animal implements GroundFoodable{
    public void food() {
        System.out.println("바나나");
    }
}

class Lion extends Animal implements GroundFoodable{
    public void food() {
        System.out.println("소고기");
    }
}

class Eagle extends Birds implements Foodable{
    Eagle() { this.name = "독수리"; }
    @Override
    public String getAction() {
        return "Fly";
    }
    public void food() {
        System.out.println("다람쥐");
    }
}

class Duck extends Birds implements Foodable{
    Duck() { this.name = "오리"; }
    @Override
    public String getAction() {
        return "Fly";
    }
    public void food() {
        System.out.println("사료");
    }
}

class Penguin extends Birds implements Foodable{
    Penguin() { this.name = "펭귄"; }
    @Override
    public String getAction() {
        return "Walk";
    }
    public void food(){
        System.out.println("물고기");
    }
}

// 동물원 클래스 정의
class Zoo{

    public void action(Ground ground){
        System.out.println("Walk");
    }

    public void action(Birds bird){
        System.out.println(bird.getAction());
        bird.getName();
    }

    public void food(Foodable animal){
        animal.food();
    }
}

public class ZooProject {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Tiger tiger = new Tiger();
        Monkey monkey = new Monkey();
        Lion lion = new Lion();
        Eagle eagle = new Eagle();
        Duck duck = new Duck();
        Penguin penguin = new Penguin();

        zoo.action(tiger);
        zoo.action(monkey);
        zoo.action(lion);
        zoo.action(eagle);
        zoo.action(duck);
        zoo.action(penguin);

        zoo.food(tiger);
        zoo.food(monkey);
    }
}
