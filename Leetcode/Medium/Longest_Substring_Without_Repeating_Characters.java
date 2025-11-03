class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, result = 0;
        String part = "";
      
        while (right < s.length()) {
            if (part.contains(String.valueOf(s.charAt(right))))
                left += part.indexOf(s.charAt(right)) + 1;
              
            right++;
            part = s.substring(left, right);
          
            if (result < part.length())
                result = part.length();
        }

        return result;
    }
}