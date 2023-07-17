class Solution {
    public int maxSubArray(int[] nums) {
        int runningSum=-9999999;
            int maxSum=-9999999;
        for(int n : nums){
            
            runningSum=Math.max(runningSum+n,n);
            maxSum=Math.max(runningSum,maxSum);
 }
        return maxSum;
    }
}