import leetcode.devr.AddTwoNumbers;
import static leetcode.devr.AddTwoNumbers.*;
import leetcode.devr.data.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAddTwoNumbers {


    @Test
    @DisplayName("TestTwoNumbersInList")
    public void testAddTwoNumbers() {
        ListNode l1 = stringToListNode("123");
        ListNode l2 = stringToListNode("657");
        ListNode answer = stringToListNode("780");

        assertEquals("123", listNodeToString(l1));
        assertEquals("657", listNodeToString(l2));
        assertEquals("780", listNodeToString(answer));
        assertEquals("780", listNodeToString(addTwoNumbers(l1, l2)));
    }
}
