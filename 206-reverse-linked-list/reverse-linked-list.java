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
    public ListNode reverseList(ListNode head) {
        if(head == null ) return null;
        ListNode curr = head;
        ListNode prev = null;
        ListNode currNext = curr.next;

        while(curr.next != null){
            curr.next = prev;
            prev = curr;
            curr = currNext;
            currNext = curr.next;
        }
        curr.next = prev;
        return curr;
    }
}