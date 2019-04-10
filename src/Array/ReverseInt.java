package Array;

public class ReverseInt {

    public static void main(String[] args) {
        ReverseInt reverseInt = new ReverseInt();
        System.out.println(reverseInt.reverse(1463847412));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    public int reverse(int x) {

       long result=0;
       while(x!=0){
           result = result*10+x%10;
           x=x/10;
           if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE){
               return 0;
           }
       }
       return (int)result;

    }
}
