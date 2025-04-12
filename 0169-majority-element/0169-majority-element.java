class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int maxCount = 0;
        int ind = -1;

        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=i+1; j<n; j++){
                //to compare element at i and  j position
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            //to check maxCount of element at every i pos
            if(count > maxCount){
                maxCount = count;
                ind = i;
            }
        }
        //to find majorityElement in array
        if(maxCount > n/2){
            return nums[ind];
        }
        return 0;
    }
}