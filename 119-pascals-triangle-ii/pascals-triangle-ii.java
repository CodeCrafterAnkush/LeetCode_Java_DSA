class Solution {
    public List<Integer> getRow(int rowIndex) {
        // int numsRow = rowIndex+1;
      List<List<Integer>> listOfLists = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
       firstRow.add(1); 
       listOfLists.add(firstRow);
        for(int i=1;i<rowIndex+1;i++){
            List<Integer> prevRow = new ArrayList<>(); 
             prevRow=listOfLists.get(i-1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for(int j=1;j<i;j++){
                currRow.add(prevRow.get(j-1)+prevRow.get(j));
                // listOfLists.get(i).add(listOfLists.get(i-1).get(j-1)+listOfLists.get(i-1).get(j-j));
            }
            currRow.add(1);
            listOfLists.add(currRow);
        }
        return listOfLists.get(rowIndex); 
        }
}