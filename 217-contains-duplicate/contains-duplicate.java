class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> number = new HashSet();

        for(int i=0;i<nums.length;i++)
        {
            if(number.contains(nums[i]))
            {
                return true;
            }
            else
                number.add(nums[i]);
        }
        return false;
    }
}