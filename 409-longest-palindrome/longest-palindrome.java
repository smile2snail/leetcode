// Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
//
// This is case sensitive, for example "Aa" is not considered a palindrome here.
//
// Note:
// Assume the length of given string will not exceed 1,010.
//
//
// Example: 
//
// Input:
// "abccccdd"
//
// Output:
// 7
//
// Explanation:
// One longest palindrome that can be built is "dccaccd", whose length is 7.
//
//


class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1) return 1;
        char[] sorted = s.toCharArray();
        Arrays.sort(sorted);
        int length = 0;
        int i=1;
        while(i<s.length()){
            if(sorted[i]==sorted[i-1]){
                length+=2;
                i+=2;
            }else{
                i++;
            }
        }
            if(length%2==0 && length<s.length()) length+=1;
    return length;
    }
}
