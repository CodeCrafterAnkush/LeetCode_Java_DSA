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
    public void reorderList(ListNode head) {
        if(head == null && head.next == null)return;
        // find middel node
        ListNode slow = head;
        ListNode fast= head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse second half
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;  // breack or cut the list
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // join them 
        ListNode p1 = head;
        ListNode p2 = prev;
        while(p2!=null){
            ListNode temp1 = p1.next;
            ListNode temp2 = p2.next;

            p1.next = p2;
            p2.next = temp1;

            p1= temp1;
            p2 =temp2;
        }
    }
}