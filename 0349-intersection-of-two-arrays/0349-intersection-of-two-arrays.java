import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1); // Sort both arrays
        Arrays.sort(nums2);
        
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                if (list.size() == 0 || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]); // Add only unique elements
                }
                i++;
                j++;
            }
        }
        
        // Convert ArrayList to array
        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }
}
