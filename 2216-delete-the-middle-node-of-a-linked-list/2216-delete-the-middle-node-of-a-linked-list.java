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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode temp = head;
        int cnt = 1;
        while (temp.next != null) {
            temp = temp.next;
            cnt++;
        }
        temp = head;
        ListNode prev = null;

        int finalcnt = cnt/2;

        cnt = 1;

        for(int i = 0; i  < finalcnt; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        
        return head;
    }
}