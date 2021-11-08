package Basic_Java;

import java.util.Random;

public class Array02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[5];
        int total=0;

        for(int i=0;i<5;i++) {
            arr[i] = rand.nextInt(100)+1;
            System.out.print(arr[i] + " ");
            total += arr[i];
        }
        System.out.println();
        System.out.println("총점은: "+total);
        System.out.println("평균은: "+(float)(total/5));

        int cnt=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>=60){
                cnt++;
            }
        }
        System.out.println("합격한 학생의 수는: "+cnt);
    }
}
