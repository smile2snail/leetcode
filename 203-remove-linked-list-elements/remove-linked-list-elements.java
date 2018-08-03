// Remove all elements from a linked list of integers that have value val.
//
// Example:
//
//
// Input:  1->2->6->3->4->5->6, val = 6
// Output: 1->2->3->4->5
//
//


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prehead = new ListNode(-1);
        prehead.next = head;
        if(head==null){
            return head;
        }
        if(head.next==null){
            if(head.val==val){
                return null;
            }else{
                return head;
            }
        }
        ListNode n = prehead;
        while(n.next!=null){
            if(n.next.val == val){
                n.next = n.next.next;
            }else{
                n = n.next;
            }
        }
    return prehead.next;
    }
}
