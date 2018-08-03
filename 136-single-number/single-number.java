// Given a non-empty array of integers, every element appears twice except for one. Find that single one.
//
// Note:
//
// Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
// Example 1:
//
//
// Input: [2,2,1]
// Output: 1
//
//
// Example 2:
//
//
// Input: [4,1,2,1,2]
// Output: 4
//
//


class Solution {
    public int singleNumber(int[] nums) {
        if(nums==null || nums.length%2==0){
            return -1;
        }else if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1]){
                i+=2;
            }else{
                return(nums[i]);
            }
        }
        return nums[nums.length-1];
    }
}
