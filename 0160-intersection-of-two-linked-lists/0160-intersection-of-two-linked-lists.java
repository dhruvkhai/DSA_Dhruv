public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        ListNode temp1 = head1;
        ListNode temp2 = head2;

        int cnt1 = 1, cnt2 = 1;
        while(temp1.next != null){
            cnt1++;
            temp1 = temp1.next;
        }
        while(temp2.next != null){
            cnt2++;
            temp2 = temp2.next;
        }

        temp1 = head1;
        temp2 = head2;

        int steps = 0;
        if(cnt1 > cnt2){
            steps = cnt1 - cnt2;
            for(int i = 0; i <= steps - 1; i++) head1 = head1.next;
        }
        else{
            steps = cnt2 - cnt1;
            for(int i = 0; i <= steps - 1; i++) head2 = head2.next;
        }

        while(head1 != null && head2 != null){
            if(head1 == head2){
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
}}