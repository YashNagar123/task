class Solution {
    public boolean areNumbersAscending(String s) {
        
        String [] words = s.split(" ");

        List<Integer> list = new ArrayList<>();

        for(int i =0;i< words.length;i++){
            if(words[i].matches("\\d+")){
                /*
word.matches("\\d+") checks if the word is purely numeric (like "123") and ignores anything else.
*/
               list.add(Integer.parseInt(words[i]));

            }
        }

        for(int i =0;i<list.size() -1;i++){
            if(list.get(i) >= list.get(i+1)) return false;
        }

        return true;
    }
}