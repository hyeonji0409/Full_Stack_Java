package Multi_Cam;

import java.util.Scanner;

/*
놀이기구 이용제한
키 입력받기
120이상 이용 간으
미만 이용 불가
부모님 함께 있으면 이용 가능
 */
public class Ex07 {
    public static void main(String[] args) {
        int height, parent;

        Scanner sc = new Scanner(System.in);

        System.out.println("키를 입력하세요: ");
        height = sc.nextInt();
        System.out.println("부모님 동반 여부를 입력하세요. (동반:1, 없음:0)");
        parent = sc.nextInt();

        if(height >= 120) {
            System.out.println("입장 가능합니다");
        }
        else {
            if(parent == 1){
                System.out.println("입장 가능합니다");
            }
            else {
                System.out.println("입장이 불가능합니다");
            }
        }
    }
}
