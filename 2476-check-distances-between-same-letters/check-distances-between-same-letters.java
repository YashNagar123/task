class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] firstIndex = new int[26];
        Arrays.fill(firstIndex, -1); // initialize with -1

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 'a';
            if (firstIndex[ch] == -1) {
                // first occurrence
                firstIndex[ch] = i;
            } else {
                // second occurrence → check distance
                int actualDistance = i - firstIndex[ch] - 1;
                if (actualDistance != distance[ch]) {
                    return false;
                }
            }
        }
        return true;
    }
}