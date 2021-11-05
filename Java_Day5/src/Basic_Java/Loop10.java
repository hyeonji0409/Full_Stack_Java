package Basic_Java;
/*
별찍기
 */
public class Loop10 {
    public static void main(String[] args) {
        for(int i = 1; i<=9;i++) {
            System.out.print("#");
            if(i%3 == 0){
                System.out.println();
            }
        }
        System.out.println();

        for(int i=0;i<3;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1;i<=3;i++){
            // 공백 출력(감소)
            for(int j=3;j>i;j--){
                System.out.print(" ");
            }
            // # 출력(증가)
            for(int j=0;j<i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1;i<=3;i++){
            // # 출력(증가)
            for(int j=3;j>=i;j--){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1;i<=3;i++){
            // 공백 출력(감소)
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            // # 출력(증가)
            for(int j=3;j>=i;j--){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1;i<=3;i++){
            // @ 출력
            for(int j=0;j<i;j++){
                System.out.print("@");
            }
            // # 출력
            for(int j=3;j>i;j--){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<3;i++){
            for(int j=1; j<3-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i*2+1;k++){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=3;i>0;i--){
            for(int j=3-i; j>0;j--){
                System.out.print(" ");
            }
            for(int k=i*2;k>0;k--){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
