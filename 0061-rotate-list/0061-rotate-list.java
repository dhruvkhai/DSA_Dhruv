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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)return null;
        if(head.next == null) return head;
        if(k == 0) return head;

        int n = 1;
        ListNode temp = head;

        while(temp.next != null){
            n++;
            temp = temp.next;
        }
        k = n - (k % n) ;

        if(k == n) return head;

        ListNode front = head;
        temp.next = front;
        
        n = 1;
        for(n = 1; n<k ; n++){
            front = front.next;
        }

        head = front.next;
        front.next= null;

        return head; 
    }
}