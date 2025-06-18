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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n==1){
            head=null;
            return head;
        }
        if(head.next.next == null && n == 1){
            head.next = null;
            return head;
        }
        int size =0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        if((size-n) == 0){
            head = head.next;
            return head;
        }
        ListNode currNode = head;
        ListNode prevNode = null;
        int nodeNth = 0;
        while(nodeNth <= (size-n)){

            if(nodeNth ==(size-n) && prevNode != null){
                if(prevNode.next.next != null){
                    prevNode.next = prevNode.next.next;
                }else{
                    prevNode.next = null;
                }
            }
            prevNode = currNode;
            currNode = currNode.next;
            nodeNth++;
        }

        return head;
    }
}