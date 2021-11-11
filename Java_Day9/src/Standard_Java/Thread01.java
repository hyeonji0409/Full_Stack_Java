package Standard_Java;

// 자바에서의 스레드는 Thread 클래스를 상속받아서
// run 메서드를 구현하도록 되어 있음
// 객체에서 start()를 호출하면 자동으로 run()이 실행되도록 구성

public class Thread01 extends Thread{
    int num;
    Thread01(int num){
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%d번 thread 실행\n", this.num);
    }

    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            Thread01 example = new Thread01(i);
            example.start();
        }
        System.out.println("Main end");
    }
}
