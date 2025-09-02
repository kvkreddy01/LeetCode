class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int left = 0;
        int right = nums.length-1;

        while(left < right)
        {
                        if (nums[left] % 2 > nums[right] % 2) {
                // Swap odd on left with even on right
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if (nums[left] % 2 == 0) left++;   // move forward if even
            if (nums[right] % 2 == 1) right--; // move backward if odd
        }

        return nums;
        }
    }