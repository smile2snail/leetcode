// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
//
// Note: The algorithm should run in linear time and in O(1) space.
//
// Example 1:
//
//
// Input: [3,2,3]
// Output: [3]
//
// Example 2:
//
//
// Input: [1,1,1,3,3,2,2,2]
// Output: [1,2]
//


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result=new ArrayList<Integer>();
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length){
            int j=i+1;
            while(j<nums.length&&nums[i]==nums[j]){
                j++;
            }
            if(j-i>nums.length/3){
                result.add(nums[i]);
            }
            i=j;
        }
        return result;
    }
}
