package amazon.KoreaSdeChallenge;

import org.junit.Test;

import java.util.List;

public class Solution2Test {

    Solution2 solution = new Solution2();

    @Test
    public void test() {
        List<String> actual = solution.getRankedCourses("Dale");
        System.out.println(actual);
    }

}
