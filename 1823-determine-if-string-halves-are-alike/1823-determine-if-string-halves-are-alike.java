class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int count=0;
        int count2=0;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
            count++;
        }
        for(int j=s.length()/2;j<s.length();j++){
             if(s.charAt(j)=='a' || s.charAt(j)=='e'|| s.charAt(j)=='i'|| s.charAt(j)=='o'|| s.charAt(j)=='u')
             count2++;
        }
        return count==count2;
    }
}