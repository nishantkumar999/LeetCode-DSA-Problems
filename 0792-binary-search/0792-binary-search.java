class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int st = 0;
        int end = n-1;
        int targInd = -1;

        while(st <= end){
            int mid = st + (end-st)/2;
            if(nums[mid] == target){
                targInd = mid;
                end = mid-1;
            }
            if(nums[mid] < target){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return targInd;
    }
}