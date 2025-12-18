class Solution {
    public String removeDigit(String number, char digit) {
        String result = "";

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                //the below step will remove only this occurrence
                // i.e. new srting excludes the character at i only
                String candidate = number.substring(0, i) + number.substring(i + 1);
                if (result.equals("") || candidate.compareTo(result) > 0) {
                    result = candidate;
                }
            }
        }

        return result;
    }
}