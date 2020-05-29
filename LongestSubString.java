Given a string, find the length of the longest substring without repeating characters.
Input: "abcabcbb"
Output: 3 


public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        
        int result = 0;
        int a_pointer = 0;
        int b_pointer = 0;
        Set<Character> set = new HashSet<>();
        while(b_pointer < s.length()){
            if(!set.contains(s.charAt(b_pointer))){
                set.add(s.charAt(b_pointer));
                b_pointer++;
                result = Math.max(result, set.size());
            }else{
                set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return result;
    }
