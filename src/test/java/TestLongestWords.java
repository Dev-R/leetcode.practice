import leetcode.devr.LongestWords;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestLongestWords {
    @Test
    @DisplayName("Test LongestWordsWithinString")
    void testLongestPhraseWithinString() {
        final String test1 = "abcdefacddja";
        final String test2 = "adsqjancjak";
        assertEquals(6, LongestWords.lengthOfLongestSubstring(test1), test1+" should equal 6");
        assertEquals(7, LongestWords.lengthOfLongestSubstring(test2), test2+" should equal 6");
    }

    @ParameterizedTest(name = "Temporary String 11")
    @CsvSource({
            "abhduderguhs, 7",
            "abcdefghijkabsd, 12"
    })
    void testLongPhraseWitingStringWithJunitCsvSource(String str, int expect) {
        assertEquals(expect, LongestWords.lengthOfLongestSubstring(str), str + " should equal " + expect);
    }
}
