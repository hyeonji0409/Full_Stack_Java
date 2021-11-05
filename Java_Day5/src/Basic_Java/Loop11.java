package Basic_Java;

public class Loop11 {
    public static void main(String[] args) {
        int n=5;
        int start = 1;
        int end = 5;
        for(int i=1; i<=n;i++){
            if(i%2 != 0){
                for(int j=start; j<=end;j++){
                    System.out.print(j+ " ");
                }
                System.out.println();
            }
            else{
                for(int k=end; k>=start;k--) {
                    System.out.print(k+ " ");
                }
                System.out.println();
            }
            start+=5;
            end+=5;
        }
    }
}
