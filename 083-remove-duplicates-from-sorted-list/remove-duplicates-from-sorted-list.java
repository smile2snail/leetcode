// Given a sorted linked list, delete all duplicates such that each element appear only once.
//
// Example 1:
//
//
// Input: 1->1->2
// Output: 1->2
//
//
// Example 2:
//
//
// Input: 1->1->2->3->3
// Output: 1->2->3
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode prehead = new ListNode(-1);
        ListNode end = prehead;
        end.next = head;
        end = end.next;
        head = head.next;
        while(head!=null){
            if(end.val != head.val){
                end.next = head;
                end = end.next;
            }
            head = head.next;
        }
            if(head==null){
                end.next=null;
            }
        return prehead.next;
    }
}

