pubic class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int size=nums1.length+nums2.length;
     int result[]=new int[size];
     for(int i=0; i<nums1.length ;i++)
     {
        result[i]=nums1[i];
     }
     for(int i=0; i<nums2.length ;i++)
     {
        result[nums1.length+i]=nums2[i];
     }
     for(int i=0;i<size-1;i++)
     {
        if(result[i]>result[i+1])
        {
            int temp=result[i];
            result[i]=result[i+1];
            result[i+1]=temp;
        }
     }
     
     if(size%2==0)
     {

        return (double)(result[size/2-1] +result[size/2])/2;
     }
     else
     {
        return result[size/2];
     
     }

    }
}