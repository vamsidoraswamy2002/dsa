class Solution {
    public boolean isPalindrome(String s) {
        //if(s.trim().isEmpty()) return true;
        String cleanedString = s.replaceAll("[^A-Za-z0-9]", "").trim().toLowerCase();
        int n = cleanedString.length();
        int i=0, j=n-1;
        while(i<n/2){
            if(cleanedString.charAt(i) != cleanedString.charAt(j)){
                return false;
            } 
            i++;
            j--;
        }
        return true;
    }

}