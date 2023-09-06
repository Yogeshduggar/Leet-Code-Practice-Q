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
    public ListNode reverseList(ListNode head) {
        ListNode current= head;
        ListNode ans=null;
        ListNode next;

        while(current!=null){
            next=current.next;
            current.next=ans;
            ans=current;
            current=next;
        }

        return ans;
    }
}