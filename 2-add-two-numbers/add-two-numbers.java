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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ansNode = new ListNode();
        ListNode head = ansNode;
        int carry =0;
        while(l1 != null || l2 != null){
            ListNode tempNode = new ListNode();
            int sum = 0;
            if(l1 == null && l2 != null){
                sum = l2.val + carry;
                l2 = l2.next;
            }else if(l1 != null && l2 == null){
                sum = l1.val+carry;
                l1 = l1.next;
            }else{
                sum = l1.val +l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            if(sum >= 10){
                carry = sum / 10;
                int ans = sum % 10;
                tempNode.val = ans;
                head.next = tempNode;
                head = head.next; 
            }else{
                tempNode.val = sum;
                head.next = tempNode;
                head = head.next;
                carry = 0;
            }

            if(l1 == null && l2 == null && carry !=0){
               ListNode carryNode = new ListNode();
               carryNode.val = carry;
               head.next = carryNode;
            }
        }

        return ansNode.next;

    }
}