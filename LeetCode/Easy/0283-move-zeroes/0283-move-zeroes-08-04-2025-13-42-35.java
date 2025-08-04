class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0, i = 0;
        int n = nums.length;
        while(i < n){
            if(nums[i] != 0) {
                nums[count++] = nums[i];
            }
            i++;
        }
        while(count < n) {
            nums[count++] = 0;
        }
    }
}