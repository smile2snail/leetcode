// Implement strStr().
//
// Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
// Example 1:
//
//
// Input: haystack = "hello", needle = "ll"
// Output: 2
//
//
// Example 2:
//
//
// Input: haystack = "aaaaa", needle = "bba"
// Output: -1
//
//
// Clarification:
//
// What should we return when needle is an empty string? This is a great question to ask during an interview.
//
// For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
//


class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        int i=0;
        int j=0;
        while(i<haystack.length()){
            if(haystack.charAt(i)!=needle.charAt(j)){
                i++;
            }else{
                j++;
                i++;
                if(j==needle.length()){
                    return i-j;
                }
                if(i==haystack.length()){
                    return -1;
                }
                if(haystack.charAt(i)!=needle.charAt(j)){
                    i=i-j+1;
                    j=0;
                }
            }
        }
        return -1;
    }
}
