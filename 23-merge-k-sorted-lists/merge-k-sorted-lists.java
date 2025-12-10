class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        List<Integer> arr = new ArrayList<>();

        for(int i =0; i < lists.length; i++){
            ListNode curr = lists[i];

            while(curr != null){
                arr.add(curr.val);
                curr = curr.next;
            }
        }
        if(arr.size() == 0) return null;
        Collections.sort(arr);

        ListNode head = new ListNode(arr.get(0));
        ListNode temp = head;
        System.out.print(temp.val);
        for(int i = 1; i < arr.size(); i++){
            temp.next =new ListNode(arr.get(i));
            temp = temp.next;
            System.out.print("->" + temp.val);
        }
        
        return head;
    }
}
