import java.lang.Math;

public class Type {
    public static void main(String[] args) {
        int num = 10;
        short small = 0;

        small = (short)num;
        System.out.println(small);

        // 정수와 실수간의 형변환
        // int와 float의 크기는 같지만(지수부와 가수부로 나누어서 생각하라)
        // float -> double로 고치면 에러 발생 X
        double real = 12.64; // = float real = 12.78f
        num = (int)real;
        System.out.println(num);

        //반올림, 올림
        System.out.println(Math.round(real));
        System.out.println((int)Math.ceil(real));
        System.out.println(Math.floor(real));
    }
}
