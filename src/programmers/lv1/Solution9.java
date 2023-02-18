package programmers.lv1;

import java.util.Arrays;

public class Solution9 {

    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }

}
