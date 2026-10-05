class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}

// int n = nums.length;
// int leftsum[] = new int[n];
// int rightsum[] = new int[n];

// leftsum[0] = nums[0];
// for(int i = 0; i<n;i++){
//     leftsum[i] = leftsum[i-1] + nums[i];
// }

// rigthsum[n-1] = nums[n-1];
// for(int i = n-2; i>=0; i--){
//     rightsum[i] = rightsum[i+1] + nums[i];
// }

// for(int i =0;i<n;i++){
//     if(leftsum[i] == rightsum[i]){
//         return i;
//     }
// }
// return -1;