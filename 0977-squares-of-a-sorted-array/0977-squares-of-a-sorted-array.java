class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];
        int first = 0;
        int last = n-1;
        for(int pos = n-1; pos>=0;pos--){
            int a = nums[first]*nums[first];
            int b = nums[last]*nums[last];
            if(a > b){
                result[pos] = a;
                first++;
            }
            else{
                result[pos] = b;
                last--;
            }
        }
        return result;
    }
}