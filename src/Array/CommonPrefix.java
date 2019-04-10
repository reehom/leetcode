package Array;

public class CommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"aa","a"};
        System.out.println(new CommonPrefix().longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length<1){
            return "";
        }
        int len = strs.length;
        String com = strs[0];
        for(int i=1;i<len;i++){
            int minLen = Math.min(strs[i].length(),com.length());
            StringBuilder   sb = new StringBuilder();
            for(int y=0;y<minLen;y++){
                if(strs[i].charAt(y)-com.charAt(y)==0){
                    sb.append(com.charAt(y));
                }else{

                    break;
                }
            }
            com = sb.toString();
            if(com.length()==0){
                return com;
            }
        }
        return com;

    }
}
