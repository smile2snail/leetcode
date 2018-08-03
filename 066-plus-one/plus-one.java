// Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
//
// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
//
// You may assume the integer does not contain any leading zero, except the number 0 itself.
//
// Example 1:
//
//
// Input: [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
//
//
// Example 2:
//
//
// Input: [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
//
//


class Solution {
    public int[] plusOne(int[] digits) {
        int carry =1;
        for(int k=digits.length-1;k>=0;k--){
            int sum = digits[k] +carry;
            digits[k] = sum%10;
            carry = sum/10;
        }
        if(carry==0){
            return digits;
        }else{
        int[] results = new int[digits.length+1];
        results[0]=1;
        for(int j=0;j<digits.length;j++){
            results[j+1]=0;
        }
        return results;
        }
    }
}
