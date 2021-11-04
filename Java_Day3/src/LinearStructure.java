import java.util.Arrays;

public class LinearStructure {
    public static void main(String[] args) {

        // 배열의 선언과 정의를 동시에(초기화)
        // 배열을 만들 때 그 크기를 정해주지 않아도 됨
        int[] number = {1, 2, 3, 4, 5, 6, 7};

        char[] str = {'h', 'e', 'l', 'l', 'o'};

        String[] subject = {"Java", "Python", "C++"};

        // 선언만 하는 경우에는 크기 지정 필요
        int[] numbers = new int[1024];

        System.out.println(Arrays.toString(subject));

        // 배열의 인덱싱 -> 배열의 각 원소에 접근하는 방법
        // 배열의 인덱싱은 0부터 순차적으로 부여됨

        // 인텍싱을 통해 값 변경 가능
        // 변수의 값을 할당하는 것과 동일
        System.out.println(number[0]);
        number[0] = 9;
        System.out.println(number[0]);

        // String
        String sample = "hello";
        System.out.println(sample);
//      sample = sample + " Java";
        sample = sample.concat(" Java");
        System.out.println(sample);

        // StringBuffer

        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        System.out.println(sb);

        sb.append(" Java");
        System.out.println(sb);

        System.out.println(sample);
        char[] arr = sample.toCharArray();
        arr[0] = 'H';
        System.out.println(arr);

    }
}

