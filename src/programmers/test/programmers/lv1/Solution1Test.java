package programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1Test {

    @Test
    void testcase() {
        //given
        long n = 118372;

        //when
        Solution1 solution1 = new Solution1();
        long ans = solution1.solution(n);

        //then
        Assertions.assertThat(ans).isEqualTo(873211);
    }

}