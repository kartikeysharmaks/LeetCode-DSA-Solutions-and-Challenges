class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] array = new int[length1 + length2];
        
        while(i < length1 && j < length2){
            if(nums1[i] <= nums2[j]){
                array[k] = nums1[i];
                i++;
                k++;
            }else{
                array[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i < length1){
            array[k] = nums1[i];
            i++;
            k++;
        }
        while(j < length2){
            array[k] = nums2[j];
            j++;
            k++;
        }
        
        int length = array.length;
         if(length % 2 == 0){
            int z = length/2;
            return (array[z] + array[z-1]) / 2.00;
        }else {
            int z = Math.round(length/2);
            return array[z];
        }
    }
}