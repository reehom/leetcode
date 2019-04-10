package Array;

public class ConvertToZ {
    public static void main(String[] args) {

    }

    public String convert(String s, int numRows) {
        String res = "";
        int len = s.length();
        int diff = 2 * numRows - 2;
        if (diff == 0)
            return s;
        char []cs = s.toCharArray();
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < len; j += diff) {
                res += cs[j];
                int cur = j + diff - 2 * i;
                if (i != 0 && i != numRows - 1 && cur < len) {
                    res += cs[cur];
                }
            }
        }
        return res;
    }

}
