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
    public ListNode middleNode(ListNode head) {
        if(head == null) return null;
        
        ListNode temp = head;
        int cnt = 1;
        while(temp.next != null){
            temp = temp.next;
            cnt++;
        }
        temp = head;
        // ListNode result;
        int finalcnt;
        if(cnt%2 == 0){
        finalcnt = Math.round(cnt/2.0f);
        finalcnt++;
        }else{
        finalcnt = Math.round(cnt/2.0f);
        }
        System.out.print(finalcnt);
        cnt = 1;
        while(temp.next != null){
            if(cnt == finalcnt){
                return temp;
            }
            temp = temp.next;
            cnt++;
        }
        return temp;
    }
}