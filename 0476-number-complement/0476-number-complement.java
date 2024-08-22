class Solution {
    public int findComplement(int num) {
        int ans=0;
        if(num==0)return 1;
        String bin=Integer.toBinaryString(num);
        int n=bin.length();
        String st="";
        for(int i=0;i<n;i++){
            if(bin.charAt(i)=='0') 
             st+="1";
             else 
             st+="0";
        }
        
        return Integer.parseInt(st,2);
         }
}