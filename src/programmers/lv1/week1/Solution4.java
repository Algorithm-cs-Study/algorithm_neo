package programmers.lv1.week1;

public class Solution4 {

    public long solution(int a, int b) {

        long answer = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }
        return answer;
    }

}