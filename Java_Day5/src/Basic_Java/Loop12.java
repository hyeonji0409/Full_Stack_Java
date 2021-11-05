package Basic_Java;

public class Loop12 {
    public static void main(String[] args) {

        int cnt = 0;
        int max=0;

        for(int i = 1; i< 100; i++){
            if(i%9==0 && i/10==6){
                System.out.println("9의 배수 중 십의 자리가 6인 첫번째 배수는: "+i+"입니다");
            }
        }

        for(int j = 50; j<=150; j++){
            if(j%8==5 && j<150){
                if(max<j){
                    max = j;
                }
            }
        }
        System.out.println("8로 나누면 5가 남는 수 중 150보다 적은 수 중에 가장 가까운 수는: "+ max +"입니다");


        for(int j=50; j<=100;j++){
            if(j%9==0){
                cnt ++;
            }
        }
        System.out.println("9의 배수는 모두 "+cnt+"개 입니다.");

        for(int i = 28; i<1000;i++){
            if(i%28==0){
                if(max<i){
                    max=i;
                }
            }
        }
        System.out.println("28의 배수 중에서 가장 큰 세자리 수는: "+max+"입니다");

        for(int i=0;i<5;i++){
            System.out.print(i*8+ " ");
        }
    }
}
