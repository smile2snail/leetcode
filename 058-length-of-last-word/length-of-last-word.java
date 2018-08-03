// Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//
// If the last word does not exist, return 0.
//
// Note: A word is defined as a character sequence consists of non-space characters only.
//
// Example:
//
// Input: "Hello World"
// Output: 5
//
//


class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        int k=s.length()-1;
        while(s.charAt(k) == ' '&& k>0){
            k--; 
        }
        int j=0;
        while( k>=0 && s.charAt(k) != ' '){               
            k--;
            j++;
        }
    return j;
    }
}