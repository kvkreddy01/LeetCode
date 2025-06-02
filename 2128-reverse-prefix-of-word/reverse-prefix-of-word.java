class Solution {
    public String reversePrefix(String word, char ch) {
       int idx = word.indexOf(ch);
        
        if (idx == -1) {
            // ch not found, return original string
            return word;
        }

        // Reverse the prefix [0...idx]
        StringBuilder sb = new StringBuilder();
        sb.append(word.substring(0, idx + 1));
        sb.reverse();
        sb.append(word.substring(idx + 1));

        return sb.toString(); 
    }
}