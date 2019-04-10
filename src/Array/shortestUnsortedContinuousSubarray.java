package Array;

public class shortestUnsortedContinuousSubarray {
    public static int findUnsortedSubarray(int[] nums) {
        int start=-1;
        int end=-1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max){
                start=i;
            }else{
                max=nums[i];
            }
            if(nums[nums.length-i-1]>min){
                end=nums.length-i-1;
            }else{
                min=nums[nums.length-i-1];
            }
        }
        return end-start+1;

    }

    public static void main(String[] args) {
         int[] nums={2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums));
    }
}
