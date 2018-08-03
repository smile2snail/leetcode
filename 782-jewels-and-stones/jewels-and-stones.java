// You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
//
// The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
// Example 1:
//
//
// Input: J = "aA", S = "aAAbbbb"
// Output: 3
//
//
// Example 2:
//
//
// Input: J = "z", S = "ZZ"
// Output: 0
//
//
// Note:
//
//
// 	S and J will consist of letters and have length at most 50.
// 	The characters in J are distinct.
//


class Solution {
    public int numJewelsInStones(String J, String S) {
        int[] stone = new int[256];
        int[] jew = new int[256];
        int count =0;
        int i=0;
        int j=0;
        while(i<S.length()){
                stone[S.charAt(i)]++;
                i++;  
        }
        while(j<J.length()){
                jew[J.charAt(j)]++;
                j++;    
        }
        for(int k=0; k<256; k++){
            if(stone[k] > 0 && jew[k] == 1){
                count+=stone[k];
            }
        }
    return count;
    }
}
