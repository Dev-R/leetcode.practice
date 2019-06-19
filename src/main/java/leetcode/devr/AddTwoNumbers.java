package leetcode.devr;

import leetcode.devr.data.ListNode;

public class AddTwoNumbers {

    //I don't check whether the string contains only number or not.
    //stringToListNode will make a string into a ListNode in reverse order.
    public static ListNode stringToListNode(String s1) {
        int length = s1.length();
        ListNode head = null;
        for (int i = 0;  i<length; i++) {
            final Character number = s1.charAt(i);
            ListNode node = new ListNode(Integer.parseInt(number.toString()));
            if (head != null)
                node.next = head;
            head = node;
        }
        return head;
    }

    public static void printOutListNode(ListNode list) {
        ListNode nextNode = list;
        do {
            System.out.println("Val : " + nextNode.val);
            nextNode = nextNode.next;
        } while(nextNode != null);
    }

    public static String listNodeToString(ListNode list) {
        StringBuilder builder = new StringBuilder();
        ListNode nextNode = list;
        do {
            builder.insert(0, String.valueOf(nextNode.val));
            nextNode = nextNode.next;
        } while (nextNode != null);
        return builder.toString();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null && l2==null)
            return null;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode node1Next = l1;
        ListNode node2Next = l2;
        ListNode result = null;
        ListNode prevNode = null;
        int tenOver = 0;
        int firstVal;
        int secondVal;

        while (true) {

            firstVal = (node1Next != null) ? node1Next.val : 0;
            secondVal = (node2Next != null) ? node2Next.val : 0;

            int sum = firstVal + secondVal + tenOver;

            tenOver = sum/10;
            sum = sum%10;

            if (result == null) {
                result = new ListNode(sum);
                prevNode = result;
            }
            else {
                ListNode newNextNode = new ListNode(sum);
                prevNode.next = newNextNode;
                prevNode = newNextNode;
            }

            if (node1Next != null)
                node1Next = node1Next.next;
            if (node2Next != null)
                node2Next = node2Next.next;

            if ( node1Next == null  && node2Next == null && tenOver == 0)
                return result;
        }
    }
}
