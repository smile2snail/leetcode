// Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//
// Example 1:
//
//
// Input: "babad"
// Output: "bab"
// Note: "aba" is also a valid answer.
//
//
// Example 2:
//
//
// Input: "cbbd"
// Output: "bb"
//
//


class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<1 || s==null) return "";
        int start=0;
        int end = 0;
        for(int i=0; i<s.length(); i++){
            int len1 = expandaroundcenter(s, i, i);
            int len2 = expandaroundcenter(s, i, i+1);
            int maxlen = Math.max(len1,len2);
            if(maxlen>end-start){
                start = i - (maxlen-1)/2;
                end = i + maxlen/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int expandaroundcenter(String s, int i1, int i2){
        while(i1>=0 && i2<s.length() && s.charAt(i1)==s.charAt(i2)){
            i1--;
            i2++;
        }
        return i2-i1-1;
    }
}
