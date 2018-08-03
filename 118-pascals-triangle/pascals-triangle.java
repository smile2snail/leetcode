// Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
//
//
// In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
// Example:
//
//
// Input: 5
// Output:
// [
//      [1],
//     [1,1],
//    [1,2,1],
//   [1,3,3,1],
//  [1,4,6,4,1]
// ]
//
//


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> star=new ArrayList<List<Integer>>();
        generate2(numRows, star);
        return star;
    }
    public void generate2(int numRows, List<List<Integer>> star){
        if(numRows<1){
            return;
        }
        if(numRows==1){
            star.add(Arrays.asList(1));
            return;
        }
        if(numRows==2){
            star.add(Arrays.asList(1));
            star.add(Arrays.asList(1,1));
            return;
        }
        star.add(Arrays.asList(1));
        star.add(Arrays.asList(1,1));
        int i=3;
        while(i<=numRows){
            List<Integer> list=new ArrayList<Integer>();
            list.add(1);
            for(int j=1;j<i-1;j++){
                list.add(star.get(i-2).get(j-1)+star.get(i-2).get(j));
            }
            list.add(1);
            star.add(list);
            i++;
        }
    }
}
