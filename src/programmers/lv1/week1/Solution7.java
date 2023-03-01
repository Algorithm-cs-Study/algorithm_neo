package programmers.lv1.week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution7 {

    public int[] solution(int[] arr, int divisor) {

        List<Integer> answerList = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) {
                answerList.add(i);
            }
        }
        Collections.sort(answerList);

        if (answerList.size() == 0) {
            return new int[]{-1};
        }

        return answerList.stream().mapToInt(i -> i).toArray();
    }

}