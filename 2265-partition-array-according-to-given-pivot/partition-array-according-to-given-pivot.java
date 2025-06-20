class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int less=0,equal=0,greater=0;
        int ans[] = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] < pivot)
            {
                ans[less] = nums[i];
                less++;
            }
        }
        equal = less;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == pivot)
            {
                ans[equal] = nums[i];
                equal++;
            }
        }
        greater = equal;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > pivot)
            {
                ans[greater] = nums[i];
                greater++;
            }
        }

        return ans;
    }
}