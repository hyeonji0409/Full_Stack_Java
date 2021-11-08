package Basic_Java;

import java.util.Scanner;

public class Array08_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] game = new int[9];

        int win = 0;
        int turn = 0;

        while(true) {
            System.out.println("=== 틱택토 ===");
            // game을 순회하면서 화면에 출력
            for( int i = 0; i < game.length; i++ ) {
                // 0 => 공백
                // 1 => O
                // 2 => X
                if(game[i] == 0) { System.out.print("[ ]"); }
                else if(game[i] == 1) { System.out.print("[O]"); }
                else { System.out.print("[X]"); }

                // 3개가 출력될 때 마다 뉴라인 출력
                if( i % 3 == 2) { System.out.println(); }

            }

            // 승리, 무승부 체크
            if (win == 1) {
                System.out.println("P[1]의 승리");
                break;
            } else if(win == 2) {
                System.out.println("P[2]의 승리");
                break;
            } else if(win == 0) {
                boolean flag = true;
                for( int i = 0; i < game.length; i++ ) {
                    if (game[i] == 0) flag = false;
                }
                if (flag) {
                    System.out.println("무승부");
                    break;
                }
            }

            // 홀수번째 입력, 짝수번째 입력(번갈가면서 입력)
            if(turn % 2 == 0) {
                System.out.print("[P1]인덱스 입력: ");
                int idx = sc.nextInt();
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

            // 가로 검사
            for( int i = 0; i < game.length; i += 3) {
                if( game[i] == 1 && game[i+1] == 1 && game[i+2] == 1) {
                    win = 1;
                }
                if( game[i] == 2 && game[i+1] == 2 && game[i+2] == 2) {
                    win = 2;
                }
            }
            // 세로 검사
            for( int i = 0; i < 3; i++) {
                if( game[i] == 1 && game[i+3] == 1 && game[i+6] == 1) {
                    win = 1;
                }
                if( game[i] == 2 && game[i+3] == 2 && game[i+6] == 2) {
                    win = 2;
                }
            }

            // 대각선
            // 제어문에서 블록내의 코드가 단 한줄인 경우에는 {} 없이 사용 가능
            if( game[0] == 1 && game[4] == 1 && game[8] == 1) win = 1;
            if( game[0] == 2 && game[4] == 2 && game[8] == 2) win = 2;
            if( game[2] == 1 && game[4] == 1 && game[6] == 1) win = 1;
            if( game[2] == 2 && game[4] == 2 && game[6] == 2) win = 2;

        } // while
    }
}
