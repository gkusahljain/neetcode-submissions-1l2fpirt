class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;

        // Find max in same loop (no extra function)
        for (int p : piles) {
            right = Math.max(right, p);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Calculate hours inline (no extra function call)
            int hours = 0;
            for (int p : piles) {
                hours += (p + mid - 1) / mid; // ceil division

                // 🔥 Early break optimization
                if (hours > h) break;
            }

            if (hours > h) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
