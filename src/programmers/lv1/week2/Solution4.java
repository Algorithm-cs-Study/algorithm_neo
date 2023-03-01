package programmers.lv1.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4 {

    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int lastNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (lastNumber != arr[i]) {
                list.add(lastNumber);
                lastNumber = arr[i];
            }
        }

        list.add(arr[arr.length - 1]);
        return Arrays.stream(list.toArray()).mapToInt(i -> (int) i).toArray();
    }
}
