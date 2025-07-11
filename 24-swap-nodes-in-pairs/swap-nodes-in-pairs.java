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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode firstNode= head;
        ListNode secondNode = firstNode.next;
        ListNode prevNode = null;

        while(firstNode != null && secondNode != null){
            ListNode thirdNode = secondNode.next;

            secondNode.next = firstNode;
            firstNode.next = thirdNode;

            if(prevNode != null){
                prevNode.next = secondNode;
            }else{
                head = secondNode;
            }
            // update
            prevNode = firstNode;
            firstNode = thirdNode;
            if(thirdNode!=null){
                secondNode = thirdNode.next;
            }else{
                secondNode = null;
            }
            
        }

        return head;

    }
}