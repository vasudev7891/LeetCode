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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next == null) return new int[]{-1, -1};

        ListNode prev = head, curr = prev.next, nextN = curr.next;
        int k = 1;
        List<Integer> list = new ArrayList<>();

        while(nextN != null) {
            if(prev.val < curr.val && curr.val > nextN.val) list.add(k);
            if(prev.val > curr.val && curr.val < nextN.val) list.add(k);
            k++;

            prev = curr;
            curr = nextN;
            nextN = nextN.next;
        }

        if(list.size() < 2) return new int[]{-1, -1};

        int min = Integer.MAX_VALUE;
        int max = list.get(list.size() - 1) - list.get(0);

        for(int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }

        return new int[]{min, max};
    }
}