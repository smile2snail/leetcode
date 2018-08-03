// Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//
// Example 1:
//
//
// Input: 121
// Output: true
//
//
// Example 2:
//
//
// Input: -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//
//
// Example 3:
//
//
// Input: 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//
//
// Follow up:
//
// Coud you solve it without converting the integer to a string?
//


class Solution {
    public boolean isPalindrome(long x) {
        if(x<0){
            return false;
        }
        if(x<10){
            return true;
        }
        ArrayList<Long> digits = new ArrayList<Long>();
        long y =x;
        while(y!=0){
            long temp = y%10;
            digits.add(temp);
            y/=10;
        }
        long s=0;
        for(int i=0; i<digits.size(); i++){
            s+=digits.get(i) * Math.pow(10,digits.size()-1-i);
        }
        if(s==x){
            return true;
        }
        return false;
    }
}
		 
