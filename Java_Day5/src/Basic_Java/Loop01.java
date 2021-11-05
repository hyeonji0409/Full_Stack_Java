package Basic_Java;
/*
주어진 범위의 숫자들의 합
 */
public class Loop01 {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0 ;
        int cnt = 0;

        for(i=0;i<=5;i++){
            sum += i;
        }
        System.out.println("1~5까지의 합은: "+sum);

        sum = 0;

        for(i=1; i<=10;i++){
            if(i < 3 || i >= 7){
                cnt += 1;
                sum += i;
                System.out.printf("%d ", i);
            }
            else {
                System.out.printf("");
            }
        }
        System.out.println();
        System.out.println("문제 2의 조건에 맞는 수들의 합: "+sum);
        System.out.println("문제 2의 조건에 맞는 수들의 개수는: "+cnt);


    }
}
