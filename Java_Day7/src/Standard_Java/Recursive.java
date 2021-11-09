package Standard_Java;

public class Recursive {
    static void recursive(int n) {
//        System.out.println("out");
//        recursive(); // 자기 자신을 호출(재귀호출)
        // 기저 조건(base condition)
        if(n>10){
            return;
        }
        System.out.println(n);
        recursive(n+1);
    }

    public static void main(String[] args) {
        recursive(1); // 트리거
    }
}
