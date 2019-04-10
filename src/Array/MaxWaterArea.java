package Array;

public class MaxWaterArea {

    public static void main(String[] args) {
        int[] m ={1,8,6,2,5,4,8,3,7};
        System.out.println(new MaxWaterArea().maxArea(m));
    }

    public int maxArea(int[] height) {
//        int max = 0;
//        for(int i=0;i<height.length;i++){
//            for(int y=i+1;y<height.length;y++){
//                int x=y-i;
//                int m=height[i]<height[y]?height[i]:height[y];
//                max=x*m>max?x*m:max;
//            }
//        }
//        return max;


        //从两端往中间取短的那个 表示在步长最长情况下  其所能取到的最大的区域
        int max = 0;
        for(int i = 0, j = height.length - 1; i < j ; ){
            int minHeight = height[i] < height[j] ? height[i ++] : height[j --];
            max = Math.max(max, (j - i + 1) * minHeight);
        }
        return max;
    }


}
