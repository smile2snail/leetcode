// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
// Example:
//
//
// Input: [-2,1,-3,4,-1,2,1,-5,4],
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.
//
//
// Follow up:
//
// If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
//


class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int sumall=0;
        int[] sum = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            sumall += nums[i];
            sum[i] = sumall;
        }
        int maxsum=sum[0];
        int minsum=Math.min(sum[0],0);
        for(int j=1; j<nums.length; j++){
            if(sum[j]-minsum>maxsum){
                maxsum=sum[j]-minsum;
            }
            if(sum[j]<minsum){
                minsum=sum[j];
            }
        }
        return maxsum;
    }
}
