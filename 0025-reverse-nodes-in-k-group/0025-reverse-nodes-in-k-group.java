/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null)
            return head;
        ListNode temp = head;
        int n = 0;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        temp = head;
        int groups = n / k;
        ListNode end = null;
        for (int i = 0; i < groups; i++) {
            ListNode start = temp;
            ListNode prev = null;
            ListNode curr = temp;
            ListNode next = null;
            for (int j = 0; j < k; j++) {
                temp = temp.next;
            }
            for (int j = 0; j < k; j++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            if (end == null) {
                head = prev;
            } else {
                end.next = prev;
            }

            start.next = temp;
            end = start;
        }

        return head;
    }
}