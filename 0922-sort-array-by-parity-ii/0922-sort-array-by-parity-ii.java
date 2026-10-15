class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length - 1;
        while(i < n){
            if(nums[i]%2 == 0){
                i = i+2;
            }else if(nums[j]%2 == 1){
                j = j+2;
            }else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i = i+2;
                j = j+2;
            }
        }
        return nums;
    }
}