package Array;

import java.util.HashSet;
import java.util.Set;

public class searchInsert {
    public static int searchInsert(int[] nums, int target) {
        //折半查找  速度更快
        // int index=0;
        // for(;index<nums.length;index++){
        //     if(nums[index]>=target) break;
        // }
        // return index;
        int left=0,right=nums.length-1;
        int mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) right=mid-1;
            else left=mid+1;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=7;
        searchInsert(nums,target);
        String J="";
        Set<Character> charSet = new HashSet<Character>();
        for(int i=0;i<J.length();i++){
            charSet.add(J.charAt(i));
        }

        int num=0;
        for(int i=0;i<J.length();i++){
            charSet.add(J.charAt(i));
        }
    }
}
