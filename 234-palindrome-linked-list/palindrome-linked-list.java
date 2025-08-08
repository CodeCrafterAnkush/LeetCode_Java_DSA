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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        // StringBuilder sb1 = new StringBuilder();
        // ListNode temp = head;
        // while (temp != null) {
        //     sb1.append(temp.val);
        //     temp = temp.next;
        // }
        // StringBuilder sb2 = new StringBuilder(sb1).reverse();
        // return (sb1.toString().equals(sb2.toString()));
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&& fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reverse = reverse(slow);
        while(reverse != null){
            if(reverse.val!= head.val)return false;
            reverse = reverse.next;
            head = head.next;
        }
        return true;
    }
}