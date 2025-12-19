class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int prev = -1;

        for (String word : words) {
            if (word.matches("\\d+")) {
                int num = Integer.parseInt(word);
                if (num <= prev) {
                    return false;
                }
                prev = num;
            }
        }

        return true;
    }
}