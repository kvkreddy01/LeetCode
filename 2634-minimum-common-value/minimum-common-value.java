class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet();
        int result = -1;
        for(int num: nums1)
        {
            set.add(num);
        }
        for(int num: nums2)
        {
            if(set.contains(num))
            {
                result = num;
                break;
            }
        }
        return result;
    }
}