// Write a function that takes a string as input and returns the string reversed.
//
//
// Example:
// Given s = "hello", return "olleh".
//


class Solution {
    public String reverseString(String s) {
    char[] qq=s.toCharArray();
        int i=0;
		int w=qq.length-1;
		while(i<w){
			char tem=qq[w];
			qq[w]=qq[i];
			qq[i]=tem;
			i++;
			w--;
    }
        String out=new String(qq);
        return out;
}
}
