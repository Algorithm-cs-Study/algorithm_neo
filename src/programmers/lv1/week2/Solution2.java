package programmers.lv1.week2;

import java.util.Scanner;

public class Solution2 {

    static final String star = "*";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < b; i++) {
            sb.append(makeRow(a));
            if (i != b - 1) {
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }

    private static String makeRow(int b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b; i++) {
            sb.append(star);
        }
        return sb.toString();
    }
}