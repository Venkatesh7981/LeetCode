class Solution {
    public int minSwaps(String s) {
         int close = 0, maxUnmatched = 0;
        for(char ch : s.toCharArray()){
            if(ch == '[') close--;
            else close++;
            maxUnmatched = Math.max(maxUnmatched, close);
        }

        return Math.ceilDiv(maxUnmatched, 2);
    }
}