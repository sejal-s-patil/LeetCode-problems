class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0;
        double max=0;
        int sum=0;
        for(int i = 0; i<k;i++){
            sum+=nums[i];
        }
        max=sum;
        for(int i =k; i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            if(sum>max){
                max=sum;
            }
        }
        avg=max/k;
    return avg;
    }
}
