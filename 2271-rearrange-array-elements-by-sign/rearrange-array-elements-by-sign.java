class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n =  nums.length;
        int res[] = new int[n];
        int posind = 0;
        int negnd = 1;

        for(int num : nums)
        {
            if(num>0)
            {
                res[posind] = num;
                posind += 2;
            }
            else
            {
                res[negnd] = num;
                negnd += 2;
            }
        }
            return res;
    }
}