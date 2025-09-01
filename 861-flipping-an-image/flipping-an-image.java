class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
               int n = image.length;

        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            // Flip and invert simultaneously
            while (left <= right) {
                // Swap elements at left and right while inverting
                int temp = image[i][left] ^ 1;   // invert using XOR
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;

                left++;
                right--;
            }
        }
        return image; 
    }
}