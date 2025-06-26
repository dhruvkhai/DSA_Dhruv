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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode(0,list1);
        ListNode temp1 = dummy;
        ListNode prev = temp1;
        int cnt = 0;
        temp1 = temp1.next;
        
        while(cnt<a){
            cnt++;
            prev = temp1;
            temp1 = temp1.next;
        }
        ListNode temp2 = temp1;
        while(cnt <= b){
            temp2 = temp2.next;
            cnt++;
        }
        prev.next = list2;

        ListNode tempb = list2;

        while(tempb.next != null){
            tempb = tempb.next;
        }
        tempb.next = temp2;



        return dummy.next;
    }
}