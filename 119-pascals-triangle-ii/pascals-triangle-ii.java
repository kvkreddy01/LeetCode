class Solution {
    public List<Integer> getRow(int rowIndex) {

if (rowIndex == 0) {
            List<Integer> baseRow = new ArrayList<>();
            baseRow.add(1);
            return baseRow;
        }

        // Get previous row
        List<Integer> previousRow = getRow(rowIndex - 1);
        List<Integer> currentRow = new ArrayList<>();

        // First element is always 1
        currentRow.add(1);

        // Compute middle elements using previous row
        for (int i = 1; i < rowIndex; i++) {
            currentRow.add(previousRow.get(i - 1) + previousRow.get(i));
        }

        // Last element is always 1
        currentRow.add(1);

        return currentRow;
        
    }
}