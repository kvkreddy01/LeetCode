class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int votes = 1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==majority)
            {
                votes++;
            }
            else if(votes == 0)
            {
                votes++;
                majority = nums[i];
            }
            else votes--;
        }

        return majority;
    }
}