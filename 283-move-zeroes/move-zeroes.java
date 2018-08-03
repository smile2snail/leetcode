// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
// Example:
//
//
// Input: [0,1,0,3,12]
// Output: [1,3,12,0,0]
//
// Note:
//
//
// 	You must do this in-place without making a copy of the array.
// 	Minimize the total number of operations.
//
//


class Solution {
    public void moveZeroes(int[] nums) {
        int nonzeroIndex = 0;
        int index = 0;
        while(index < nums.length) {
            if(nums[index] != 0){
                int t = nums[index];
                nums[index] = nums[nonzeroIndex];
                nums[nonzeroIndex] = t;
                nonzeroIndex++;
            }
            index++;
        }
    }
}
