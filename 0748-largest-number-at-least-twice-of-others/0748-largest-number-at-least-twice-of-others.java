class Solution {
    public int dominantIndex(int[] nums) {
        int largeNum = Integer.MIN_VALUE;
        int largeNumIndex = -1;

        //to check largest Number
        for(int i=0; i<nums.length; i++){
            if(nums[i] > largeNum){
                largeNum = nums[i];
                largeNumIndex = i;
            }
        }

        //To check largest Number is at least twice of others
        for(int i=0; i<nums.length; i++){
            if(largeNumIndex != i && largeNum < 2*nums[i]){
                return -1;
            }
        }
        return largeNumIndex;
    }
}