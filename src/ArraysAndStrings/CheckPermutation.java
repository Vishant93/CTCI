package ArraysAndStrings;

public class CheckPermutation {
    public static void main(String[] args) {
        String a = "jacket";
        String b = "cajtea";
        System.out.println(checkPermutation(a,b));
    }
    public static boolean checkPermutation(String x, String y) {
        int[] counts = new int[26];
        for (char c : x.toCharArray()) {
            counts[c-'a']++;
        }
        for (char c : y.toCharArray()) {
            counts[c-'a']--;
        }
        for (int i : counts) {
            if (i != 0) return false;
        }
        return true;
    }
}
