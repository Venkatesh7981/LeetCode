class Solution {
     public boolean isAnagram(String a, String b) {
    //     if(s.length()!=t.length()) return false;
    //     int [] chr=new int[26];
    //     for(int i=0;i<s.length();i++){
    //         chr[s.charAt(i)-97]+=1;
    //     }
    //      for(int i=0;i<t.length();i++){
    //        if( chr[t.charAt(i)-97]==0){
    //         return false;
    //        }
    //     chr[t.charAt(i)-97]-=1;
    //      }
    //      return true;
     if(a.length()!=b.length()) 
        return false;
        char arr[]=a.toCharArray();
        char arr2[]=b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        return Arrays.equals(arr,arr2)? true:false;
    }
}