package Standard_Java;
// 418p. 예제 8-2

// 모든 예외는 Exception 클래스를 상속 받아서 정의
// 직접 예외를 정의
class UserException extends Exception{
    UserException() {
        System.out.println("내가 만든 예외");
    }
}

// 예외의 흐름
class Sub {
    public int convToInt(String strs) {
        try {
            return Integer.parseInt(strs);
        }
        catch (Exception e){
            System.out.println("예외가 발생한 곳에서 처리");
            // 예외도 객체
            throw new ArithmeticException(); // 예외 던져줌
        }
    }
}

class Others extends Object {
    public int middleMethod(String strs) throws UserException{
        Sub s = new Sub();
        try {
            return s.convToInt(strs);
        } catch (ArithmeticException e) { // 던진 예외 받는 곳
            System.out.println("middleMethod 에서 예외가 처리됨");
            throw new UserException();
        }
    }
}

public class ExceptionTest01 {
    public static void main(String[] args) {
        Others exam = new Others();
        int num = 0;
        try {
            num = exam.middleMethod("a");
        }
        catch (Exception e){
            System.out.println("결국 여기까지 오고야 말았구나"); // 예외가 처리되는 곳
        }
        System.out.println(num);

    }
}