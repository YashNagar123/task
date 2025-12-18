class Solution {
    public int rearrangeCharacters(String s, String target) {
        
        int [] a1 = new int[26];
        int [] a2 = new int[26];

        for(char ch : s.toCharArray()){
            
            a1[ch-97]++;
        }

        for(char ch : target.toCharArray()){
            
            a2[ch-97]++;
        }

        int c = Integer.MAX_VALUE; // start with large value

        for (int i = 0; i < 26; i++) {
            if (a2[i] != 0) { // only check chars in target
                c = Math.min(c, a1[i] / a2[i]);
            }
        }

        return c;

    }
}