class Solution {
    public int firstUniqChar(String s) {
        
        if(s==null ||s.length()==0) return -1;
        int  ans[]=new int[26];
        for(int i=0;i<s.length();i++){
            ans[s.charAt(i)-'a']++;
        }
            for(int j=0;j<s.length();j++){
                if(ans[s.charAt(j)-'a']==1) return j;
                }
            
       return -1;
    }
}