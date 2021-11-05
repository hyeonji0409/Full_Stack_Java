package Basic_Java;

public class Loop05 {
    public static void main(String[] args) {
        for(int i=1; i<=50;i++){
            int a = i/10;
            int b = i % 10;
            if(a == 3 || a == 6 || a == 9){
                if(b == 3 || b == 6 || b == 9){
                    System.out.print("짝짝 ");
                    continue;
                }
                else{
                    System.out.print("짝 ");
                }
            }
            else if(b==3 || b==6 || b==9) {
                System.out.print("짝 ");
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
}
