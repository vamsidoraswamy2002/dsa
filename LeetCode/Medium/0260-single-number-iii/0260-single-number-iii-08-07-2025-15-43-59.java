class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] res = new int[2];

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            //System.out.println(entry.getKey() + ": " + entry.getValue());
            if(entry.getValue() == 1){
                res[count++] = entry.getKey();
            }
        }
        return res;
    }
}