// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
// Example:
//
//
// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8
// Explanation: 342 + 465 = 807.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode start = new ListNode(1);
        ListNode combine = start;
        int carry=0;
        int i1=0;
        int i2=0;
        int i3=0;
        while(l1!=null || l2!=null){
            i1=(l1!=null)?l1.val:0;
            i2=(l2!=null)?l2.val:0;
            i3=(i1+i2+carry)%10;
            carry = (i1+i2+carry)/10;
            combine.next = new ListNode(i3);
            combine=combine.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry>0) combine.next=new ListNode(carry);
        return start.next;
    }
}
