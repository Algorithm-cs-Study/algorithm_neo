package programmers.lv1.week1;

public class Solution3 {

    public boolean solution(int x) {
        int sum = sumOfDigit(x);
        return x % sum == 0;
    }

    private int sumOfDigit(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
