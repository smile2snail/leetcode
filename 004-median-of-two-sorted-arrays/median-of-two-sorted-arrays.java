// There are two sorted arrays nums1 and nums2 of size m and n respectively.
//
// Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//
// You may assume nums1 and nums2 cannot be both empty.
//
//  
//
// Example 1:
//
//
// nums1 = [1, 3]
// nums2 = [2]
//
// The median is 2.0
//
//
// Example 2:
//
//
// nums1 = [1, 2]
// nums2 = [3, 4]
//
// The median is (2 + 3)/2 = 2.5
//
//


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combine = new int[nums1.length + nums2.length];
        int i1=0;
        int i2=0;
        int i=0;
        while(i1<nums1.length || i2<nums2.length){
            if(i1>=nums1.length){
                combine[i]=nums2[i2];
                i2++;
            }else if(i2>=nums2.length){
                combine[i]=nums1[i1];
                i1++;
            }else if(nums1[i1]<=nums2[i2]){
                combine[i] = nums1[i1];
                i1++;
            }else{
                combine[i]=nums2[i2];
                i2++;
            }
            i++;
        }
        if(combine.length%2==0){
            return (double)((combine[combine.length/2]+combine[combine.length/2-1])/2.0);
        }else{
            return combine[(combine.length-1)/2];
        }
    }
}
