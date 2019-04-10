package Array;

public class IsPalindrome {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(new IsPalindrome().isPalindrome(x));
    }
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int len=str.length();
        if(len<2){
            return true;
        }
        int i=0;
        for(;i<len/2;i++){
            if(str.charAt(i)-str.charAt(len-i-1)==0){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
