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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> st= new ArrayList<Integer>();
        ArrayList<Integer> re= new ArrayList<Integer>();
        while(head!=null){
            st.add(head.val);
             re.add(head.val);
            head=head.next;
        }
        
        Collections.reverse(re);
        System.out.println(re);
         System.out.println(st);
        if(st.equals(re)){
            return true;
        }
        return false;
    }
}