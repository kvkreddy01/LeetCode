class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
              HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (indexMap.containsKey(nums[i])) {
                int previousIndex = indexMap.get(nums[i]);
                if (Math.abs(i - previousIndex) <= k) {
                    return true; // Found duplicate within range
                }
            }
            indexMap.put(nums[i], i); // Store current index
        }

        return false;  
    }
}