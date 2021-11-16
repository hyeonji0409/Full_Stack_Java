import java.util.Scanner;

public class Main {

    static int d(int n){
        int q = n;
        int r = 0;

        int m = n;
        while(q !=0){
            m += q%10;
            q /= 10;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int ans = 0;
        for(int i = 0; i < n; i++){
            int m = d(i);
            if(m == n){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
