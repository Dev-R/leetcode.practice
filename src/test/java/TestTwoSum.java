import leetcode.devr.TwoSum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTwoSum {

    /* Need to Check the following link to convert array-elements in CsvSource to a array
    https://stackoverflow.com/questions/46849439/junit5-parameterizedtest-how-to-pass-array-as-one-of-parameter
    @ParameterizedTest
    @CsvSource({
            "{1, 2, 3, 4,11, 23}, 34, {4, 5}",
            "{5,6,22,31,1}, 7, {4, 1}"
    })
     */
    @Test
    @DisplayName("TwoSumTest")
    public void testTwoSum () {
        final TwoSum twoSum = new TwoSum();
        assertArrayEquals(new int[]{4,5}, twoSum.solutionWithBrutalForce(new int[]{1,2,3,4,11,23}, 34), "Test For");
        assertArrayEquals(new int[]{4,5}, twoSum.solutionWithHashMap(new int[]{1,2,3,4,11,23}, 34), "Test For");
        assertArrayEquals(new int[]{4,5}, twoSum.solutionWithHashMapImprovement(new int[]{1,2,3,4,11,23}, 34), "Test For");
    }
}
