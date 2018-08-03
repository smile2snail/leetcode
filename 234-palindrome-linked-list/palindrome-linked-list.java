// Given a singly linked list, determine if it is a palindrome.
//
// Example 1:
//
//
// Input: 1->2
// Output: false
//
// Example 2:
//
//
// Input: 1->2->2->1
// Output: true
//
// Follow up:
// Could you do it in O(n) time and O(1) space?
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
    public boolean isPalindrome(ListNode head) {
	        ArrayList<Integer> nod=new ArrayList<Integer>(); 
	        while(head!=null){
	            int i=head.val;
	            nod.add(i);
	            head=head.next;
	        }
	        int i=0;
	        int w=nod.size()-1;
	        while(i<nod.size()&&w>=0){
	        	int itemi=nod.get(i);
	        	int itemw=nod.get(w);
	        	if(itemi!=itemw){
	        		return false;
	        	}else{
		        	i++;
		        	w--;
		        }
	        }
	        return true;
		}
}
