class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversedWords = new StringBuilder();
        for(int i=0; i<words.length; i++){
            reversedWords.append(words[words.length - i - 1]);
            if(i != words.length - 1){
                reversedWords.append(" ");
            }
        }
        return reversedWords.toString();
    }
}