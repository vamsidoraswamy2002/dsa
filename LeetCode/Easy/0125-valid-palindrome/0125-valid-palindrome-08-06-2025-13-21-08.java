class Solution {
    public boolean isPalindrome(String s) {
        //if(s.trim().isEmpty()) return true;
        int left = 0;
    int right = s.length() - 1;
    
    // Step 2: Check palindrome property with skipping non-alphanumeric
    while (left < right) {
        // Find the next valid alphanumeric character from left
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }
        
        // Find the next valid alphanumeric character from right
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }
        
        // Compare characters in a case-insensitive manner
        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false; // Not a palindrome if any mismatch occurs
        }
        
        // Move pointers inward
        left++;
        right--;
    }
    return true;
    }

}