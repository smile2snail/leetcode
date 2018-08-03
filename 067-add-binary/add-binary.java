// Given two binary strings, return their sum (also a binary string).
//
// The input strings are both non-empty and contains only characters 1 or 0.
//
// Example 1:
//
//
// Input: a = "11", b = "1"
// Output: "100"
//
// Example 2:
//
//
// Input: a = "1010", b = "1011"
// Output: "10101"
//


class Solution {
    public String addBinary(String a, String b) {
        int a1=a.length()-1;
        int b1=b.length()-1;
        int carry=0;
        String result = "";
        while(a1>=0 && b1>=0){
            int a2 = a.charAt(a1) -'0'; 
            int b2 = b.charAt(b1) -'0';
            int c2 = a2+b2+carry;
            carry = c2/2;
            int sum = c2%2;
            Character c1 = (char)(sum +'0');
            result = c1 + result;
            a1--;
            b1--;
        }
        while(a1>=0){
            int a2 = a.charAt(a1) -'0'; 
            int c2 = a2+carry;
            carry = c2/2;
            int sum = c2%2;
            Character c1 = (char)(sum +'0');
            result = c1 + result;
            a1--;
        }
        while(b1>=0){
            int b2 = b.charAt(b1) -'0'; 
            int c2 = b2+carry;
            carry = c2/2;
            int sum = c2%2;
            Character c1 = (char)(sum +'0');
            result = c1 + result;
            b1--;
        }
        if(carry==1){
            result = '1' + result;
        }
        return result;
    }
}
