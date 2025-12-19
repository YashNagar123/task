class Solution {

    static int add(String chunk) {
    int sum = 0;
    for (int i = 0; i < chunk.length(); i++) {
        sum += chunk.charAt(i) - '0'; // simpler than Character.getNumericValue
    }
    return sum;
}


    public String digitSum(String s, int k) {

        int n = s.length();
        while(n > k){
                String [] arr;
            if(n%k == 0 ) arr = new String [n/k];
            else arr = new String [(n/k) + 1];

            for(int i= 0;i<n;i+=k){
                arr[i/k] = s.substring(i, Math.min(i+k, n));
            }
             StringBuilder l = new StringBuilder();
                for (int i = 0; i < arr.length; i++) {
                l.append(add(arr[i]));
                }
            s = l.toString();

            n= s.length();
        }

        return s;
    }
}