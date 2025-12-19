class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]); // always keep the first word

        for (int i = 1; i < words.length; i++) {
            if (!isAnagram(words[i], words[i - 1])) {
                list.add(words[i]);
            }
        }
        return list;
    }

    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26];
        for (char c : s1.toCharArray()) freq[c - 'a']++;
        for (char c : s2.toCharArray()) freq[c - 'a']--;

        for (int f : freq) {
            if (f != 0) return false;
        }
        return true;
    }
}