/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode t1=head;
        ListNode t2=head;
        while(t1!=null && t2.next!=null){ 
            if(t1.next==null ||t2.next.next==null){
                return false;
            }
            t1=t1.next;
            t2=t2.next.next;
            if(t1==t2){
                return true;
            }
        }
        return false;
    }
}