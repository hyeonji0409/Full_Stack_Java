package Baekjoon;

import java.util.ArrayList;

public class Baekjoon4673 {
    static int d(int n) {
        int q = n;
        int r = 0;

        int next = n;
        while (q != 0) {
            next += q % 10;
            q /= 10;
        }
        return next;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 1; i <= 10000; i++) {
            numbers.add(d(i));
        }

        for (int i = 1; i <= 10000; i++) {
            if (!numbers.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
