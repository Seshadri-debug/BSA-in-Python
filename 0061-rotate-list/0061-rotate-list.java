class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;

        int n = length(head);
        if (k % n == 0) return head;

        k = n > k ? k : k % n;

        ListNode node = head;
        for (int i = 0; i < n - k - 1; ++i) {
            node = node.next;
        }

        ListNode res = node.next;
        node.next = null;

        ListNode tail = res;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = head;
        return res;
    }

    private int length(ListNode node) {
        int n = 0;
        while (node != null) {
            node = node.next;
            n++;
        }
        return n;
    }
}