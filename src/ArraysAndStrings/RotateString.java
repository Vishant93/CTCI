package ArraysAndStrings;

public class RotateString {
    public static void main(String[] args) {
        String A = "abcde", B = "cdeab";
        String C = "abcde", D = "abced";
        boolean result = rotateString(A,B);
        System.out.println(result);
        boolean result2 = rotateString(C,D);
        System.out.println(result2);
    }
    public static boolean rotateString(String a, String b) {
        return a.length() == b.length() && (a+a).contains(b);
    }
}
