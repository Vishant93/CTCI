package ArraysAndStrings;

public class StringCompression {
    public static void main(String[] args) {
        char[] letters = {'a','a','b','b','b','b','c','c','c'};
        String result = compress(letters);
        System.out.println(result);
    }
    public static String compress(char[] chars) {
        char[] frequencies = new char[26];
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            frequencies[c-'a']++;
        }
        for (int i = 0; i < chars.length-1; i++) {
            sb.append(chars[i]);
            if ((chars[i] != chars[i+1]) && frequencies[chars[i] - 'a'] > 1) {
                sb.append(frequencies[i]);
            }
        }
        return sb.toString();
    }
}


