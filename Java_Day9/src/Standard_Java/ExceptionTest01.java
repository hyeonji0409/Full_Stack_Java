package Standard_Java;
// 418p. 예제 8-2

public class ExceptionTest {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for(int i = 0; i< 10; i++){
            // 어떤 수이든 0으로 나눌 수 없음
            result = number / (int)(Math.random() * 10);
            System.out.println(result);
        }
    }
}
