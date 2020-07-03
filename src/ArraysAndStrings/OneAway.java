package ArraysAndStrings;

public class OneAway {
    public static void main(String[] args) {
        String a = "pale";
        String b = "ale";
        boolean result = oneAway(a,b);
        System.out.println(result);
    }
    public static boolean oneAway(String x, String y) {
        if (Math.abs(x.length()-y.length()) > 1) return false;
        int diff = 0;
        int i = 0, j = 0;
        int m = x.length(), n = y.length();
        while (i < m && j < n) {
            char a = x.charAt(i);
            char b = y.charAt(j);
            if (a != b) {
                if (diff == 1) return false;
                if (m > n) i++;
                else if (m < n) j++;
                else {
                    i++;
                    j++;
                }
                diff++;
            }
            else {
                i++;
                j++;
            }
        }
        if (i < m || j < n)
            diff++;

        return diff == 1;
    }
}
