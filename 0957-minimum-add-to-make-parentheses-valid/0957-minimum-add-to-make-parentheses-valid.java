class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int imbal=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
            }
            else if(count>0){
                count--;
            }
            else imbal++;
        }
        return count+imbal;
    }
}