// The count-and-say sequence is the sequence of integers with the first five terms as following:
//
// 1.     1
// 2.     11
// 3.     21
// 4.     1211
// 5.     111221
//
//
//
// 1 is read off as "one 1" or 11.
// 11 is read off as "two 1s" or 21.
// 21 is read off as "one 2, then one 1" or 1211.
//
//
//
// Given an integer n, generate the nth term of the count-and-say sequence.
//
//
//
// Note: Each term of the sequence of integers will be represented as a string.
//
//
// Example 1:
//
// Input: 1
// Output: "1"
//
//
//
// Example 2:
//
// Input: 4
// Output: "1211"
//
//


class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int i=0; i<n-1; i++){
            s = say(s);
        }
    return s;
    }
    
    public String say(String s){
        ArrayList<Integer> times= new ArrayList<Integer>();
        ArrayList<Character> chars= new ArrayList<Character>();
        char[] origins = s.toCharArray();
        int j=0;
        int k=0;
        String sayout = "";
        while(j<s.length()){
            if(origins[j]==origins[k]){
                j++;
            }else{
                times.add(j-k);
                chars.add(origins[k]);
                k=j;
            }
            if(j==s.length()){
                times.add(j-k);
                chars.add(origins[k]);
            }
        }
        for(int z=0; z<times.size();z++){
            sayout = sayout + times.get(z)+chars.get(z);
        }
        return sayout;
    }
}

