package programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution7Test {

    Solution7 solution7 = new Solution7();

    @Test
    void testcase1() {
        //given
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        //when
        int[] answer = solution7.solution(arr, divisor);

        //then
        Assertions.assertThat(answer[0]).isEqualTo(5);
        Assertions.assertThat(answer[1]).isEqualTo(10);
    }

    @Test
    void testcase2() {
        //given
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;

        //when
        int[] answer = solution7.solution(arr, divisor);

        //then
        Assertions.assertThat(answer[0]).isEqualTo(1);
        Assertions.assertThat(answer[1]).isEqualTo(2);
        Assertions.assertThat(answer[2]).isEqualTo(3);
        Assertions.assertThat(answer[3]).isEqualTo(36);
    }

    @Test
    void testcase3() {
        //given
        int[] arr = {3, 2, 6};
        int divisor = 10;

        //when
        int[] answer = solution7.solution(arr, divisor);

        //then
        Assertions.assertThat(answer[0]).isEqualTo(-1);
        Assertions.assertThat(answer.length).isEqualTo(1);
    }

}