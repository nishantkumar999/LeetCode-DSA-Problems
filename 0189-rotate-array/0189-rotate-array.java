class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int i, j;

        //First Reverse the array from 0 to n-k.
        for(i=0, j=n-k-1; i<j; i++, j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        //Second Reverse the array from n-k to n.
        for(i=n-k, j=n-1; i<j; i++, j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        //Reverse the new array.
        for(i=0; i<n/2; i++){
            int temp = nums[i];
            nums[i] = nums[n-1-i];
            nums[n-1-i] = temp;
        }

        //Print the rotated array.
        for(int x=0; x<n; x++){
            System.out.print(nums[i] + " ");
        }
    }
}