class Solution {
    public int maxSubArray(int[] nums) {
        int runningSum=-214748364;
            int maxSum=-214748364;
        for(int n : nums){
            
            runningSum=Math.max(runningSum+n,n);
            maxSum=Math.max(runningSum,maxSum);
 }
        return maxSum;
    }
}