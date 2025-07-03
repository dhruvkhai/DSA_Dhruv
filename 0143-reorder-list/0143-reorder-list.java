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
    public void reorderList(ListNode head) {
        ListNode temp = head; 
        HashMap<Integer,ListNode> map = new HashMap<>();
        // count nodes
        int cnt = 1;
        while(temp.next != null){
            temp = temp.next;
            cnt++;
        }
        // put nodes into map
        int val = 1;
        temp = head;
        for(int i = 1; i<= cnt; i++){
            map.put(val++,temp);
            temp = temp.next;
        }
        val--;
        cnt = 1;
        int steps = 1;
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;
        ListNode temp1 = head;
        while(val >= cnt){
            if(steps%2 != 0){
                prev.next = temp1;
                prev = prev.next;
                cnt++;
                temp1 = temp1.next;
                steps++;
            }else{
                prev.next = map.get(val);
                prev = prev.next;
                val--;
                steps++;
            }
        }
        prev.next = null;
    }
}
