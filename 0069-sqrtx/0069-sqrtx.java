class Solution {
    public int mySqrt(int x) {
        int lo=0;
        int hi=x;
        int count=0;
        if(x==1){
            return 1;
        }
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            
            if(mid!=0&& mid > x/mid){
                hi=mid-1;
            }
            else if(mid!=0 && mid < x/mid){
                count=mid;
                lo=mid+1;

            }
            else{
                return mid;
            }
        }
        return count;
    }}