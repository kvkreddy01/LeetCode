class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        
        char ch[] = s.toCharArray();
           int i,j;
        int result = 0;
        for(i=0,j=1;j<ch.length;i++,j++)
        {
            if(romanMap.get(ch[i])>=romanMap.get(ch[j]))
            {
                result=result+romanMap.get(ch[i]);
            }
            else
            {
                result=result-romanMap.get(ch[i]);
            }
        }
        return result = result+romanMap.get(ch[i]);
    }
}