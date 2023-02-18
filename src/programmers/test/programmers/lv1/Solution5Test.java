package programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5Test {

    Solution5 sol = new Solution5();

    @Test
    void testcase1() {

        //given
        int n = 6;

        //when
        int answer = sol.solution(n);

        //then
        Assertions.assertThat(answer).isEqualTo(8);
    }

    @Test
    void testcase2() {

        //given
        int n = 16;

        //when
        int answer = sol.solution(n);

        //then
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void testcase3() {

        //given
        int n = 626331	;

        //when
        int answer = sol.solution(n);

        //then
        Assertions.assertThat(answer).isEqualTo(-1);
    }

}