package programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class Solution3Test {

    Solution3 solution3 = new Solution3();

    @Test
    void testcase1() {
        //given
        int arr = 10;

        //when
        boolean answer = solution3.solution(arr);

        //then
        Assertions.assertThat(answer).isEqualTo(true);
    }

    @Test
    void testcase2() {
        //given
        int arr = 12;

        //when
        boolean answer = solution3.solution(arr);

        //then
        Assertions.assertThat(answer).isEqualTo(true);
    }

    @Test
    void testcase3() {
        //given
        int arr = 11;

        //when
        boolean answer = solution3.solution(arr);

        //then
        Assertions.assertThat(answer).isEqualTo(false);
    }

    @Test
    void testcase4() {
        //given
        int arr = 13;

        //when
        boolean answer = solution3.solution(arr);

        //then
        Assertions.assertThat(answer).isEqualTo(false);
    }



}