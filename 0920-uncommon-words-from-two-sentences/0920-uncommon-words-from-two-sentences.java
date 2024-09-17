class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();
         
         String []w1=s1.split(" ");
         String []w2=s2.split(" ");
         for(String s:w1){
            map.put(s,map.getOrDefault(s,0)+1);
         }
         for(String s:w2){
            map.put(s,map.getOrDefault(s,0)+1);
         }
         for(String word:map.keySet()){
            if(map.get(word)==1){
                list.add(word);
            }
         }
         return list.toArray(new String[0]);
    }
}