package programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution8Test {

    Solution8 sol = new Solution8();

    @Test
    void testcase1() {
        //given
        String phone_number = "01033334444";
        String s = sol.solution(phone_number);

        //when

        //then
        Assertions.assertThat(s).isEqualTo("*******4444");
    }

    @Test
    void testcase2() {
        //given
        String phone_number = "027778888";
        String s = sol.solution(phone_number);

        //when

        //then
        Assertions.assertThat(s).isEqualTo("*****8888");
    }

}