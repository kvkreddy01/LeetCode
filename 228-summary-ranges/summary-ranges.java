class Solution {
    public List<String> summaryRanges(int[] nums) {
       List<String> ranges = new ArrayList<>();

        if (nums.length == 0) {
            return ranges; // Return empty list if nums is empty
        }

        int start = nums[0]; // Start of the range

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) { // If sequence breaks
                if (start == nums[i - 1]) {
                    ranges.add(String.valueOf(start)); // Single number range
                } else {
                    ranges.add(start + "->" + nums[i - 1]); // Multi-number range
                }
                start = nums[i]; // Update start
            }
        }

        // Add the last range
        if (start == nums[nums.length - 1]) {
            ranges.add(String.valueOf(start));
        } else {
            ranges.add(start + "->" + nums[nums.length - 1]);
        }

        return ranges; 
    }
}