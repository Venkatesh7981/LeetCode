class Solution {
    public int maxScore(String s) {
        // Calculate the number of One's
        int onesCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='1'){
                onesCount++;
            }
        }
        int res = 0;
        int zerosCount = 0;
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i)=='0'){
                zerosCount++;
            }
            else{
                onesCount--;
            }
            res = Math.max(res, zerosCount + onesCount);
        }

        return res;
    }
}