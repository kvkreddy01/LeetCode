class Solution {
    public int captureForts(int[] forts) {
        int maxCapture = 0;
        int last = -1;  // index of last seen 1 or -1

        for (int i = 0; i < forts.length; i++) {
            if (forts[i] == 1 || forts[i] == -1) {
                if (last != -1 && forts[i] != forts[last]) {
                    // Count number of 0s between last and current
                    maxCapture = Math.max(maxCapture, Math.abs(i - last) - 1);
                }
                last = i;
            }
        }

        return maxCapture;
    }
}