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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode dummy = new ListNode(-200,head); 
        ListNode temp = dummy;
        ListNode prev = temp;
        while(temp != null){
            if(prev.val == temp.val){
                temp = temp.next;
            }else{
                prev.next = temp;
                prev = temp;
                temp = temp.next;
            }

            if(temp == null) prev.next = null;
        }
        return dummy.next;
    }
}