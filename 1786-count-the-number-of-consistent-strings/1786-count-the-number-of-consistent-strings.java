class Solution {
    public int countConsistentStrings(String all, String[] words) {
     Set <Character> ans=new HashSet<>();
     for(int i=0;i<all.length();i++){
        ans.add(all.charAt(i));
     }
     int count=0;
     for(String ch:words){
        int flag=1;
        for(int i=0;i<ch.length();i++){
            if(!ans.contains(ch.charAt(i))){
                flag=0;
                break;
            }
        }
        count+=flag;
     }
     return count;
    }
}