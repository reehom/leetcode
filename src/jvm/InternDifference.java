package jvm;

import java.util.concurrent.ConcurrentHashMap;

public class InternDifference {
    public static void main(String[] args) {
        String s = new String("abb");
        s.intern();
        String s2 = "abb";
        System.out.println(s == s2);

        String s3 = new String("a") + new String("a");
        s3.intern();
        String s4 = "aa";
        System.out.println(s3 == s4);

        String s5 = "a" + "a";
        System.out.println(s4 == s5);
    }


}
