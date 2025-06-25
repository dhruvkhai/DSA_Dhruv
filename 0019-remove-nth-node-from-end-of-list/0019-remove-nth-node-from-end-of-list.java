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
        if(head == null) return null;
        if( n == 0  ) return head;

        ListNode dummy = new ListNode(0,head);
        ListNode left = dummy;
        ListNode right = dummy;

        for(int i = 0; i<= n; i++){
            right = right.next;
        }

        while(right != null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;

        return dummy.next;
        // ListNode temp = head;
        // ListNode prev = temp;

        // int cnt = 1;
        // while(temp.next != null ){
        //     cnt++;
        //     temp = temp.next;
        // }
        // int steps = (cnt - n) ;
        // temp = head;

        // for(int i = 0; i < steps; i++){
            
        //     prev = temp;
        //     temp = temp.next;
        // }

        
        // if(temp.next==null){
        //     prev.next = null;
        // }else{
        //         prev.next = temp.next;
        // }
        
        
    }
}

