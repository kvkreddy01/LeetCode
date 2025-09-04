class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            count += freq.getOrDefault(num, 0); // new pairs with previous same nums
            freq.put(num, freq.getOrDefault(num, 0) + 1); // update frequency
        }
        return count;
    }
}