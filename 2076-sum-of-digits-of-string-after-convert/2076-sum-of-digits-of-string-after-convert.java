class Solution {
    public int getLucky(String s, int k) {
        String numString="";
        for(char ch:s.toCharArray()){
          int num=ch-'a'+1;
          numString+=String.valueOf(num);
        }
        int res=-1;
        while(k>0){
            res=0;
            for(char ch:numString.toCharArray()){
                res+=Integer.parseInt(""+ch);

            }
            numString=String.valueOf(res);
            k--;
        }
       return res;
    }
}