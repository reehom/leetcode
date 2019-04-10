package Array;

public class MyAtoi {

    public static void main(String[] args) {
        String s = "9223372036854775808";
        System.out.println(new MyAtoi().myAtoi(s));
    }

    public int myAtoi(String str) {
        str = str.trim();
        if(str==null || str.length()==0){
            return 0;
        }

        long result = 0;
        boolean t = true;
        char c = str.charAt(0);
        if(c=='-'){
            t=false;
            str = str.substring(1);
        }else if(c=='+'){
            t=true;
            str=str.substring(1);
        }else if(c>='0' &&c<='9'){
            t=true;
        }
        else{
            return 0;
        }
        for(int i=0;i<str.length();i++){
            c = str.charAt(i);
            int re = c-'0';
            if(re>=0 && re<=9){
                result = t?result*10+re:result*10-re;
            }else{
                break;
            }
            if(result>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(result<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int)result;
    }
}
