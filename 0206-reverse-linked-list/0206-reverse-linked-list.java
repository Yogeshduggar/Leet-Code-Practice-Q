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
    public ListNode rev(ListNode head,ListNode newhead){
        if(head==null){
            return newhead;
        }
        ListNode next=head.next;
        head.next=newhead;
        return rev(next,head);
    }

    public ListNode reverseList(ListNode head) {
        return rev(head,null);
    }
}