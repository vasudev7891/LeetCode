class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = curr.next;

        int index = 1;

        int first = -1;
        int last = -1;
        int minDistance = Integer.MAX_VALUE;

        while (next != null) {

            if ((curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val)) {

                if (first == -1) first = index;
                else minDistance = Math.min(minDistance, index - last);

                last = index;
            }

            prev = curr;
            curr = next;
            next = next.next;
            index++;
        }

        if (first == -1 || first == last) return new int[]{-1, -1};

        int maxDistance = last - first;

        return new int[]{minDistance, maxDistance};
    }
}