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
        int cnt = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            cnt++;
        }
        cnt = cnt/2 ;
        System.out.println(cnt);
        temp = head;
        while(cnt > 0){
            temp = temp.next;
            cnt--;
        }
        return temp;
    }
}