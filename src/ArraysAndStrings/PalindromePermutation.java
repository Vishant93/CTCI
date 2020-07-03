package ArraysAndStrings;

public class PalindromePermutation {
    public static void main(String[] args) {
        String word = "Tact Coa";
        boolean result = palindromePermutation(word);
        System.out.println(result);
    }
    public static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }
    public static boolean palindromePermutation(String x) {
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') -
                Character.getNumericValue('a')+1];
        for (char c : x.toCharArray()) {
            int z = getCharNumber(c);
            if (z != -1) {
                table[z]++;
                if (table[z] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }
}
