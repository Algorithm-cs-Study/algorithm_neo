package programmers.lv1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution9Test {

    Solution9 solution9 = new Solution9();

    @Test
    void testcase1() {
        //given
        int[] arr = {4,3,2,1};

        //when

        //then
        int[] answer = solution9.solution(arr);
        for (int i : answer) {
            System.out.println(i);
        }
    }

    @Test
    void testcase2() {
        //given
        int[] arr = {10};

        //when

        //then
        int[] answer = solution9.solution(arr);
        for (int i : answer) {
            System.out.println(i);
        }
    }

}