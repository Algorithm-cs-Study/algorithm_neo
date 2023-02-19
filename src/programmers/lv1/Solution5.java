package programmers.lv1;

public class Solution5 {

    int count = 0;

    public int solution(int num) {

        if (num == 1) {
            return 0;
        }

        while (num != 1) {
            if (count > 500) {
                return -1;
            }

            if (num % 2 == 1) {
                num = oddRule(num);
            } else {
                num = evenRule(num);
            }
        }

        return count;
    }

    private int evenRule(int num) {
        count++;
        return num / 2;
    }

    private int oddRule(int num) {
        count++;
        return (num * 3) + 1;
    }

}
