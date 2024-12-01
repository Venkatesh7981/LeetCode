class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> map=new HashSet<>();
        for(int num:arr){
            if(map.contains(2*num)||num%2==0&&map.contains(num/2)){
                return true;
            }
            map.add(num);
        }
        return false;
    }
}