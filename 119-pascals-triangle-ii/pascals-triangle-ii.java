// Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
//
// Note that the row index starts from 0.
//
//
// In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
// Example:
//
//
// Input: 3
// Output: [1,3,3,1]
//
//
// Follow up:
//
// Could you optimize your algorithm to use only O(k) extra space?
//


class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> star=new ArrayList<Integer>();
        if(rowIndex<0){
            return star;
        }
        if(rowIndex==0){
            star.add(1);
            return star;
        }
        if(rowIndex==1){
            star.add(1);
            star.add(1);
            return star;
        }
        star.add(1);
        List<Integer> previousRow=getRow(rowIndex-1);
        // loop n times, every function call O(m)
        for(int j=1;j<rowIndex&&rowIndex>=1;j++){
            int q=previousRow.get(j-1)+previousRow.get(j);
            star.add(q);
        }
        star.add(1);
        return star;
    }
}

