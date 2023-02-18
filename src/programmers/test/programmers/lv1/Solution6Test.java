package programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution6Test {

    Solution6 solution6 = new Solution6();

    @Test
    void testcase() {
        //given
        String[] seoul = {"Jane", "Kim"};

        //when
        String answer = solution6.solution(seoul);

        //then
        Assertions.assertThat(answer).isEqualTo("김서방은 1에 있다");
    }

}