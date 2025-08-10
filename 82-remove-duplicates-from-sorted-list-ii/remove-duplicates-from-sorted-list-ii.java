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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ListNode temp = head;
        while(temp != null){
            if(map.containsKey(temp.val)){
                map.put(temp.val,map.get(temp.val)+1);
            }else{
                map.put(temp.val,1);
            }
            temp = temp.next;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null){
            if(map.get(curr.val)==1){
                prev= curr;
            }else{
                prev.next = curr.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}