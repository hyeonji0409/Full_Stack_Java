package Basic_Java;

import java.util.Scanner;

public class Array08_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] game = new int[9];

        int win = 0;
        int turn = 0;

        while (true) {
            System.out.println("===틱택토===");

            // game 순회하며 화면 출력
            for (int i = 0; i < game.length; i++) {
                // 0-> 공백
                // 1 -> O
                // 2 -> X
                if (game[i] == 0) {
                    System.out.print("[ ]");
                } else if (game[i] == 1) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[X]");
                }

                // 3개가 출력될 때 마다 new line 출력
                if (i % 3 == 2) {
                    System.out.println();
                }
            }
            // 홀수번째 입력, 짝수번째 입력(번갈아가면서 입력 받을 수 O)
            if (turn % 2 == 0) {
                System.out.print("[P1]인덱스 입력: ");
                int idx = sc.nextInt();
//                if(idx < 0 && idx > 10){
//                    System.out.println("잘못 입력했습니다.");
//                }
                idx--;
                if (game[idx] == 0) {
                    game[idx] = 1;
                    turn++;
                }
            } else if (turn % 2 != 0) {
                System.out.print("[P2]인덱스 입력: ");
                int idx = sc.nextInt();
                idx--;
                if (game[idx] == 0) {
                    game[idx] = 2;
                    turn++;
                }
            }

            // 승리 조건
            // 가로 조건
            if (game[0] == 1 && game[1] == 1 && game[2] == 1) win = 1;
            if (game[0] == 2 && game[1] == 2 && game[2] == 2) win = 2;
            for (int i = 1; i < game.length; i += 3) {
                if (game[i] == 1 && game[i + 1] == 1 && game[i + 2] == 1) {
                    win = 1;
                }
                if (game[i] == 2 && game[i + 1] == 2 && game[i + 2] == 2) {
                    win = 1;
                }
            }
            // 세로 검사
            for (int i = 1; i < game.length; i += 1) {
                if (game[i] == 1 && game[i + 3] == 1 && game[i + 6] == 1) {
                    win = 1;
                }
                if (game[i] == 2 && game[i + 3] == 2 && game[i + 6] == 2) {
                    win = 1;
                }
            }
            // 대각선 검사
            if (game[0] == 1 && game[4] == 1 && game[8] == 1) win = 1;
            if (game[0] == 2 && game[4] == 2 && game[8] == 2) win = 2;
            if (game[2] == 1 && game[4] == 1 && game[6] == 1) win = 1;
            if (game[2] == 2 && game[4] == 2 && game[6] == 2) win = 2;

            if(win==1){
                System.out.println("P[1]의 승리");
                break;
            }
            else if(win==0){
                System.out.println("P[2]의 승리");
                break;
            }
            else if(win==0){
                boolean flag = true;
                for(int i=0; i<game.length;i++){
                    if(game[i]==0) flag = false;
                }
                if(flag){
                    System.out.println("무승부입니다");
                    break;
                }
            }
        } //while
    }
}
