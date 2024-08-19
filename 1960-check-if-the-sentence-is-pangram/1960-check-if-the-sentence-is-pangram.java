class Solution {
    public boolean checkIfPangram(String s) {
         String str = "abcdefghijklmnopqrstuvwxyz";
          s=s.toLowerCase();
         for(int i=0;i<26;i++){
         char ch=str.charAt(i);
         if(!s.contains(ch+"")) return false;
         }
         return true;
    }
}