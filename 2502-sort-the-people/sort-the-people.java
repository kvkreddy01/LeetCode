class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
           int n = names.length;
        
        // Create array of pairs (name, height)
        String[][] people = new String[n][2];
        for (int i = 0; i < n; i++) {
            people[i][0] = names[i];
            people[i][1] = String.valueOf(heights[i]);
        }

        // Sort by height descending
        Arrays.sort(people, (a, b) -> Integer.parseInt(b[1]) - Integer.parseInt(a[1]));

        // Extract names
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = people[i][0];
        }

        return result;

    }
}