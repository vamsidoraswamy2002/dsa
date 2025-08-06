class Solution {
    public boolean isPalindrome(String s) {
        if(s.trim().isEmpty()) return true;

        String cleanedString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return checkForPalindrome(0, cleanedString);
    
    }

    boolean checkForPalindrome(int start, String s){
        int n = s.length();
        if(start >= n/2) return true;

        if(s.charAt(start) == s.charAt(n-start-1)) {
            return checkForPalindrome(start + 1, s);
        } 
        return false;
    }

}