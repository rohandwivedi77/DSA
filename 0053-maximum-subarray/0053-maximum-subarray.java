class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i< nums.length; i++){
            //sum create karte hai
            sum = sum + nums[i];
            //maxi update karte hai
            maxi = Math.max(maxi,sum);
            //sum check karna for negetive value
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}