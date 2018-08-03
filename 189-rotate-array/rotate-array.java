// Given an array, rotate the array to the right by k steps, where k is non-negative.
//
// Example 1:
//
//
// Input: [1,2,3,4,5,6,7] and k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
//
//
// Example 2:
//
//
// Input: [-1,-100,3,99] and k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]
//
//
// Note:
//
//
// 	Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
// 	Could you do it in-place with O(1) extra space?
//
//


class Solution {
    public int[] rotate(int[] nums, int k) {
        if(k<=0||nums==null||nums.length==0||k%nums.length==0){
            return nums;
        }else{
            k=k%nums.length;
            int[] newArray=new int[nums.length];
            for(int i=nums.length-k;i<nums.length;i++){
                newArray[i-(nums.length-k)]=nums[i];
            }
            
            for(int i=0;i<nums.length-k;i++){
                newArray[i+k]=nums[i];
            }
            for(int i=0;i<newArray.length;i++){
                nums[i]=newArray[i];
            }
            return newArray;
        }
    }
}
