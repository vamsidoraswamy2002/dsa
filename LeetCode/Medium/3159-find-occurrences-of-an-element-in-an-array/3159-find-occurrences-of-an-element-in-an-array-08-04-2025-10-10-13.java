class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> indicesOccurencesOfX = new ArrayList();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == x) indicesOccurencesOfX.add(i);
        }
        int[] result = new int[queries.length];
        for(int i = 0; i<queries.length; i++){
            if(queries[i] <= indicesOccurencesOfX.size()){
                result[i] = indicesOccurencesOfX.get(queries[i]-1);
            } else result[i] = -1;
        }
        return result;
    }
}