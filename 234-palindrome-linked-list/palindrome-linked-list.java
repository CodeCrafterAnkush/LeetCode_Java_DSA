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
        StringBuilder sb1 = new StringBuilder();
        ListNode temp = head;
        while (temp != null) {
            sb1.append(temp.val);
            temp = temp.next;
        }
        StringBuilder sb2 = new StringBuilder(sb1).reverse();
        return (sb1.toString().equals(sb2.toString()));
    }
}