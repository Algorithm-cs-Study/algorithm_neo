package programmers.lv1.week2;

public class Solution3 {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int min = Math.min(n, m);
        int max = Math.max(n, m);

        answer[0] = GCD(min, max);
        answer[1] = LCD(min, max, answer[0]);

        return answer;
    }

    private static int GCD(int n, int m) {
        if (m == 0) {
            return n;
        }
        return GCD(m, n % m);
    }

    private static int LCD(int n, int m, int gcd) {
        if (n == m) {
            return n;
        }
        return n * m / gcd;
    }

}
