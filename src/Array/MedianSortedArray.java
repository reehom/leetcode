package Array;

import java.util.ArrayList;

public class MedianSortedArray {
    public static void main(String[] args) {
        int[] n={1,2};
        int[] m={3,4};
        MedianSortedArray medianSortedArray = new MedianSortedArray();
        System.out.println(medianSortedArray.findMedianSortedArrays(n,m));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int y=0;
        ArrayList<Integer> intList = new ArrayList<>();
        while(i<=nums1.length && y<=nums2.length){
            int n=Integer.MAX_VALUE;
            int m=Integer.MAX_VALUE;
            if(i<nums1.length){
                n=nums1[i];
            }
            if(y<nums2.length){
                m=nums2[y];
            }
            if(n==Integer.MAX_VALUE && m==Integer.MAX_VALUE){
                break;
            }

            if(n<m){
                intList.add(n);
                i++;
            }else {
                intList.add(m);
                y++;
            }
        }
        int s = intList.size();
        if(s%2==0){
            return (intList.get(s/2)+intList.get((s/2)-1))/2.0;
        }else {
            return intList.get(s/2)/1.0;
        }
    }
}
