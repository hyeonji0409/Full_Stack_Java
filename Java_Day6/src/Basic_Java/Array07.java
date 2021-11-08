package Basic_Java;

import java.util.Scanner;

public class Array07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] game = {0,0,2,0,0,0,0};
        int player = 0;

        for(int i=0;i<7;i++){
            if(game[i]==2){
                player = i;
            }
        }
        while(true){
            for(int i=0;i<game.length;i++){
                if(game[i]==2){
                    System.out.print("옷");
                }
                else{
                    System.out.print("_");
                }
            }
            System.out.println();
            System.out.println("왼쪽[1], 오른쪽[2]");
            int mov = sc.nextInt();

            // 왼쪽 이동
            if(mov==1){
                // 현재 game 배열에서 캐릭터 위치 확인
                for(int i=0; i<game.length;i++){
                    if(game[i]==2){
                        // 배열 가장 왼쪽가지 왔다면, 더 이상 이동 불가
                        if(i==0){
                            continue;
                        }
                        // 캐릭터 값 왼쪽 배열로 대입
//                        game[i-1] = game[i];
//                        game[i] = 0;
                        int tmp = game[i-1];
                        game[i-1] = game[i];
                        game[i] = tmp;
                    }
                }
            }
            // 오른쪽 이동
            else if(mov==2){
                for(int i=0; i<game.length;i++){
                    if(game[i]==2){
                        if(i==game.length-1){
                            continue;
                        }
                        int tmp = game[i+1];
                        game[i+1] = game[i];
                        game[i] = tmp;
                        break;
                    }
                }

            }
        }
    }
}
