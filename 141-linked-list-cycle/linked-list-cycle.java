//
// Given a linked list, determine if it has a cycle in it.
//
//
//
// Follow up:
// Can you solve it without using extra space?
//


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
        if(head==null){
            return false;
        }
        if(head.next==null||head.next.next==null){
            return false;
        }
        ListNode xman=head;
        ListNode yman=head;
        while(xman!=null&&yman!=null){
            if(xman.next==null){
                return false;
            }
            xman=xman.next;
            if(yman.next==null){
                return false;
            }
            if(yman.next.next==null){
                return false;
            }
            yman=yman.next.next;
            if(xman==yman){
                return true;
            }
        }
        return false;
    }
}
