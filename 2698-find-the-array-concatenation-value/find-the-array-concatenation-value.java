class Solution {
    public long findTheArrayConcVal(int[] nums) {
        
        int left = 0;
        int right = nums.length-1;
        long total = 0;

        while(left<right)
        {
            String conVal = String.valueOf(nums[left])+String.valueOf(nums[right]);
            total += Long.parseLong(conVal);
            left++;
            right--;
        }
        return (nums.length %2 == 0) ? total : total+Long.valueOf(nums[left]);
    }
}