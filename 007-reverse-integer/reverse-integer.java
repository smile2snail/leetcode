// Given a 32-bit signed integer, reverse digits of an integer.
//
// Example 1:
//
//
// Input: 123
// Output: 321
//
//
// Example 2:
//
//
// Input: -123
// Output: -321
//
//
// Example 3:
//
//
// Input: 120
// Output: 21
//
//
// Note:
// Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
//


class Solution {
        public int reverse(int x){
            long y = x;
            long d;
            if(y>0){
                d = re(y);
            }else{
                d =-re(-y);
            }
            if(d>Math.pow(2,31)-1 || d<-Math.pow(2,31)){
            return 0;
            }
            return (int)d;
        }
            
        public static long re(long y){
            ArrayList<Long> reversal = new ArrayList<Long>();
            if(y<10 || y==0){
                return y;
            }
            while(y!=0){
                long temp=y%10;
                reversal.add(temp);
                y/=10;
            }
            int a=reversal.size();
            long z=0;
            for(int b=0;b<a;b++){
                z+=reversal.get(b)*(Math.pow(10,(a-b-1)));
            }
            if(z>Integer.MAX_VALUE || z<Integer.MIN_VALUE){
                return 0;
            }else{
                return z;   
            }
        }
}
