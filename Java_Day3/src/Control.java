import java.lang.reflect.Array;
import java.util.Arrays;

public class Control {
    public static void main(String[] args) {

        String[] arr = {"Hello", "Java", "String"};

        System.out.println(Arrays.asList(arr).contains("Hello"));
        System.out.println(Arrays.asList(arr).contains("Python"));

        if(Arrays.asList(arr).contains("Java")) {
            System.out.println("명제가 참이면 실행");
        }

    }
}
