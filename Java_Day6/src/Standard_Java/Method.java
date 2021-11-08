package Standard_Java;


public class Method {
    
    // 가장 기본적인 형태의 멧드
    //입력 X, 출력 X
    // 자바에서는 클래스 내부에서 선언 가능
    
    static void method(){ //Callee
        //메서드가 실행됐는지 알 수 있는 출력문 작성
        System.out.println("함수 실행");
    }

    // 다양한 형태의 메서드들
    /*
    1. 입력이 있는 메서드(Parameter(매개변수), arguments(인자))
    -> 메서드 실행에 필요한 입력값 미리 정의
    -> 개수의 제한은 없지만, 불필요하게 많을 경우 속도를 저하시킴
     */
    static  void add(int a, int b){
        // 두 정수를 입력받아서 더한 값을 출력
//        System.out.println(a + b);
        int sum = a + b;
    }

    // return이 메서드
    // 메서드가 실행이 종료되고 나서 돌려주는 값이 존재
    // 돌려줄 값이 없어도 메서드의 실행이 잘 종료되었는지
    // 정보를 돌려주는 것이 좋음
    // 메서드 선언 시에 정의한 리턴 타입과 실제 리턴되는 값의 타입은 항상 일치!!
    static int add2(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("main 메서드 한정 특별 취급");

        // 메서드는 누군가 호출하기 전까지는 실행되지 않음
        //메서드 호출
        method(); //Caller

        // 함수는 한 번 정의를 해놓으면, 몇번이고 반복해서 호출(실행)할 수 있음
        method();
        
        // 선언된 메서드를 실행하고 싶은 호출을 해야 함
        // 호출할 때는, 메서드 원형을 그대로 따라줘야 함
        // 입력 갑 전달
        // 메서드가 선언된 형태에 따라 필요한 값을 호출할 때 명시해야함(반드시)
        // 순서, 타입, 갯수가 정확히 일치해야 함
        // 전달은 JVM이 알하서 수행
        add(3,4);
        add2(4,1);

        // main 함수는 sum에 대해 알 수 없음
//        System.out.println(sum);
    }

}
