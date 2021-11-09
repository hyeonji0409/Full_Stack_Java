package Basic_Java;

import java.util.Arrays;
import java.util.Random;

class Ex01{
    void test1(){
        int total=0;

        for(int i=1;i<=5;i++){
            total += i;
        }
        System.out.println(total);
    }

    void test2() {
        Random rand = new Random();

        int[] arr = new int[3];
        for(int i = 0; i<arr.length; i++){
            arr[i] = rand.nextInt(100)+1;
        }
        System.out.println(Arrays.toString(arr));

        int max = 0;
        for(int val:arr){
            if(max<val){
                max = val;
            }
        }
        System.out.println(max);
    }
}

public class Method01 {
    public static void main(String[] args) {

        Ex01 e = new Ex01();

        e.test1();

        e.test2();
    }
}
