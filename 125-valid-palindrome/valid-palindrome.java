// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
// Note: For the purpose of this problem, we define empty string as valid palindrome.
//
// Example 1:
//
//
// Input: "A man, a plan, a canal: Panama"
// Output: true
//
//
// Example 2:
//
//
// Input: "race a car"
// Output: false
//
//


class Solution {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()==1){
            return true;
        }
        s=s.toUpperCase();
        int i1=0;
        int i2=s.length()-1;
        while(i1<i2){
            if((!Character.isLetter(s.charAt(i1)))&&(!Character.isDigit(s.charAt(i1)))){
                i1++;
            }else if((!Character.isLetter(s.charAt(i2)))&&(!Character.isDigit(s.charAt(i2)))){
                i2--;
            }else if(s.charAt(i1)!=s.charAt(i2)){
                return false;
            }else{
                i1++;
                i2--;
            }
        }
    return true;
    }
}
