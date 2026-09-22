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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        int cnt = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            cnt++;
        }
        if(cnt == n) return head.next;
        int curr = cnt - n + 1;
        cnt = 1;
        ListNode dummy = head, prev = new ListNode(-1, dummy);
        while (cnt != curr) {
            prev = dummy;
            dummy = dummy.next;
            cnt++;
        }

        prev.next = dummy.next;
        dummy.next = null;
        return head;
    }
}