package Goorm;

import java.util.Scanner;

public class replaceAll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String string = scan.nextLine();
        String result = string.replaceAll(" ","");
        System.out.println(result);
    }
}
