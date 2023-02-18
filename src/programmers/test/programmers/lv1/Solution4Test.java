package programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution4Test {

    Solution4 solution4 = new Solution4();

    @Test
    void testcase1() {
        //given
        int a = 3;
        int b = 5;

        //when
        long answer = solution4.solution(a, b);

        //then
        Assertions.assertThat(answer).isEqualTo(12);
    }

    @Test
    void testcase2() {
        //given
        int a = 3;
        int b = 3;

        //when
        long answer = solution4.solution(a, b);

        //then
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void testcase3() {
        //given
        int a = 5;
        int b = 3;

        //when
        long answer = solution4.solution(a, b);

        //then
        Assertions.assertThat(answer).isEqualTo(12);
    }

}