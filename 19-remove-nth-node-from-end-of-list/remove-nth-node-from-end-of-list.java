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
        if(head == null || head.next == null) return null;
        int cnt = 1;
        ListNode temp = head;
        while(temp.next != null){
            cnt++;
            temp = temp.next;
        }
        System.out.println(cnt);
        if(cnt == n) return head.next;
        int finalcnt = cnt - n;
        temp = head;
        cnt = 1;
        while(cnt < finalcnt){
            temp = temp.next;
            cnt++;
        }
        temp.next = temp.next.next;
        return head;
    }    
}

