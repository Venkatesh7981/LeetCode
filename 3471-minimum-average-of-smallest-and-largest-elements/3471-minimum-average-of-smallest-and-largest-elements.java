class Solution {
    public double minimumAverage(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        double min=Double.MAX_VALUE;
        double avg=0;
        for(int i=0;i<n/2;i++){
           avg=(arr[i]+arr[n-1-i])/2.0;
           if(min>avg){
            min=avg;
           }
        }
        return min;
    }
}