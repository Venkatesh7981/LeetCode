class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        int x=g.length;
        int y=s.length;
        while(i<x && j<y){
          if(g[i]<=s[j]){
            i++;
          }
            j++;
        }
    return i;
      }
}