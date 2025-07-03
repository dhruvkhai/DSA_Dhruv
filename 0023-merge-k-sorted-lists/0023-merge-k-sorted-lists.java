class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arr = new ArrayList<>();

        // ✅ Collect all values into the list
        for (int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while (temp != null) {
                arr.add(temp.val);
                temp = temp.next;
            }
        }

        // ✅ Handle edge case: empty input
        if (arr.size() == 0) return null;

        // ✅ Sort the values
        List<Integer> sorted = mergeSort(arr, 0, arr.size() - 1);

        // ✅ Build the final sorted linked list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int val : sorted) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }

    // ✅ Merge Sort Function (returns sorted list)
    public static List<Integer> mergeSort(List<Integer> arr, int low, int high) {
        if (low == high) {
            List<Integer> base = new ArrayList<>();
            base.add(arr.get(low));
            return base;
        }

        int mid = (low + high) / 2;
        List<Integer> left = mergeSort(arr, low, mid);
        List<Integer> right = mergeSort(arr, mid + 1, high);

        return merge(left, right);
    }

    // ✅ Merge Two Sorted Lists
    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));

        return result;
    }
}
