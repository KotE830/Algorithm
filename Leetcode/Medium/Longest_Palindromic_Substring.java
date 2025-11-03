class Solution {
    public String longestPalindrome(String s) {
        int left = 0, right = 0;
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; i + j < s.length() && i - j >= 0; j++) {
                if (s.charAt(i-j) != s.charAt(i+j)) {
                    break;
                } else if (right - left < j * 2) {
                    left = i - j; right = i + j;
                }
            }

            for (int j = 0; i + j < s.length() && i - j - 1 >= 0; j++) {
                if (s.charAt(i-j-1) != s.charAt(i+j)) {
                    break;
                } else if (right - left < j * 2 + 1) {
                    left = i - j - 1; right = i + j;
                }
            }
        }

        return s.substring(left, right + 1);
    }
}
