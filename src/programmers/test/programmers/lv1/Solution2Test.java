package programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class Solution2Test {

    Solution2 solution2 = new Solution2();

    @Test
    void testcase1() {
        //given
        int n = 10;

        //when

        int answer = solution2.solution(n);

        //then
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void testcase2() {
        //given
        int n = 12;

        //when
        int answer = solution2.solution(n);

        //then
        Assertions.assertThat(answer).isEqualTo(11);
    }

}