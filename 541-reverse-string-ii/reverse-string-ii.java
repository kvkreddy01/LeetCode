class Solution {
    public String reverseStr(String s, int k) {

        char[] ch = s.toCharArray();
        int n = s.length();
        for(int i = 0; i< n; i+= 2*k)
        {
            int left = i;
            int right = Math.min(n-1,i+k-1);
            while( left < right)
            {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }
}