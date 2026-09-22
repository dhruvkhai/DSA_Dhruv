/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int cnt1 = 1, cnt2 = 1;
        ListNode tempA = headA, tempB = headB;
        while(tempA != null){
            cnt1++;
            tempA= tempA.next;
        }
        System.out.println(cnt1);
        while(tempB != null){
            cnt2++;
            tempB= tempB.next;
        }
        System.out.println(cnt2);
        int cnt = 0;
        if(cnt2 > cnt1) {
            cnt = cnt2 - cnt1;
            while(cnt > 0){
                cnt--;
                headB = headB.next;
            }
        }
        else {
            cnt = cnt1 - cnt2;
            while(cnt > 0){
                cnt--;
                headA = headA.next;
            }
        }

        while(headA != null){
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}