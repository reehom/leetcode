package Array;

import java.util.HashSet;
import java.util.Set;

public class NotRepeatSubString {
    public static void main(String[] args) {
            String s = "abcabcbb";
            NotRepeatSubString n = new NotRepeatSubString();
        System.out.println(n.lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        for(int i =0;i<s.length();i++){
            Set<Character> characterSet = new HashSet<>();
            characterSet.add(s.charAt(i));
            for(int y=i+1;y<s.length();y++){
                if(characterSet.contains(s.charAt(y))){
                    break;
                }else{
                    characterSet.add(s.charAt(y));
                }
            }
            result = characterSet.size()>result?characterSet.size():result;
        }
        return result;
    }
}
