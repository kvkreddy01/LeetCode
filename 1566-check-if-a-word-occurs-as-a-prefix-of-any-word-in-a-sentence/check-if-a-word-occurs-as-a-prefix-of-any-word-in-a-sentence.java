class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int len = searchWord.length();
        String[] words = sentence.split(" ");

        for(int i=0;i<words.length;i++)
        {
            if(words[i].length() < len)
            {
                continue;
            }

            if(searchWord.equals(words[i].substring(0,len)))
            {
                return i+1;
            }
        }
        return -1;
    }
}