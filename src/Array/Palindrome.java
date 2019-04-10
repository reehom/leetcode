package Array;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.longestPalindrome("a"));
    }


    public String longestPalindrome(String s) {

        if(s.length()<2){
            return s;
        }
        String result = String.valueOf(s.charAt(0));
        for(int i = 0;i<s.length();i++){
            for(int y=s.length()-1;y>i;y--){
                int n=i,m=y;
                while(n<m){
                    if(s.charAt(n)==s.charAt(m)){
                        n++;
                        m--;
                    }else{
                        break;
                    }
                }
                if(n>=m){
                    result=y-i+1>result.length()?s.substring(i,y+1):result;
                }

            }
            if(result.length()>s.length()-i){
                return result;
            }
        }
        return result;
    }
}
