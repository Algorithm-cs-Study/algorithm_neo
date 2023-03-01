package programmers.lv1.week1;

import java.util.Arrays;
import java.util.Collections;

public class Solution1 {

    public long solution(long n) {
        String[] toArray = String.valueOf(n).split("");
        Arrays.sort(toArray, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String s : toArray) {
            sb.append(s);
        }
        return Long.parseLong(sb.toString());
    }

}
