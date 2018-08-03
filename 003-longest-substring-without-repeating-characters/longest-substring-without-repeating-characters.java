// Given a string, find the length of the longest substring without repeating characters.
//
// Examples:
//
// Given "abcabcbb", the answer is "abc", which the length is 3.
//
// Given "bbbbb", the answer is "b", with the length of 1.
//
// Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
//


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j=0;
        int maxlength=0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            while(j<s.length() && !set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    j++;                   
            }
            maxlength = Math.max(maxlength, j-i); 
            set.remove(s.charAt(i));
        }
    return maxlength;
    }
}
