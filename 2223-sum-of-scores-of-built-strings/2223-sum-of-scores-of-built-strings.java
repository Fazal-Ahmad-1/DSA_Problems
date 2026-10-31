
class Solution {
    public long sumScores(String s) {

        int n = s.length();

        int[] z = new int[n];

        int left = 0;
        int right = 0;

        long sum = n;

        for (int i = 1; i < n; i++) {

            // If current index is inside the Z-box
            if (i <= right) {
                z[i] = Math.min(right - i + 1, z[i - left]);
            }

            // Extend the matching characters
            while (i + z[i] < n &&
                   s.charAt(z[i]) == s.charAt(i + z[i])) {

                z[i]++;
            }

            // Update the Z-box
            if (i + z[i] - 1 > right) {
                left = i;
                right = i + z[i] - 1;
            }

            // Add current score
            sum += z[i];
        }

        return sum;
    }
}
