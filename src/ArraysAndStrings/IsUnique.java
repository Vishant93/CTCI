package ArraysAndStrings;

public class IsUnique {
    public static void main(String[] args) {
        boolean result1 = isUnique("abcdef");
        boolean result2 = isUnique("zyxwutvw");
        System.out.println(result1);
        System.out.println(result2);
    }
    public static boolean isUnique(String x) {
        int[] counts = new int[26];
        for (char c : x.toCharArray()) {
            counts[c-'a']++;
        }
        return false;
    }
}
