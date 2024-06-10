//Given the number of rows n. Print the first n rows of Pascal’s triangle.

class Solution {
    public List<Integer> genRow(int row){
        int a=1;
        List<Integer> aRow = new ArrayList<>();
        aRow.add(1);
        for(int col=1;col<row;col++){
            a= a*(row-col);
            a= a/(col);
            aRow.add(a);
        }
        return aRow;
    }

    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1;row<=n;row++){
            ans.add(genRow(row));
        }
        return ans;
    }
}
