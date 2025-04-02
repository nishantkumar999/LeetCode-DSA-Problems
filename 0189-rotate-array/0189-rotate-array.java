class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int i, j;

        //first reverse n-k terms in array.
        for(i=0, j=n-k-1; i<j; i++, j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        //secondly reverse k terms in array.
        for(i =n-k, j=n-1; i<j; i++, j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        //At last revrese entire array.
        for(i = 0, j=n-1; i<j ; i++, j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        for(i=0; i<n; i++){
            System.out.println(nums[i] + " ");
        }
    }
}