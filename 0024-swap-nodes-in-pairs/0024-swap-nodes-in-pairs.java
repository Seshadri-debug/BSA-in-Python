class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode temp=head;
        head=head.next;
        ListNode swap=head.next;
        head.next=temp;
        head.next.next=swapPairs(swap);
        return head;
    }
}