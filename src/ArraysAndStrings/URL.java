package ArraysAndStrings;

public class URL {
    public static void main(String[] args) {
        String temp = "Mr John Smith";
        String result = URLify(temp);
        System.out.println(result);
    }
    public static String URLify (String x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            char temp = x.charAt(i);
            if (temp == ' ')
                sb.append("%");
            else
                sb.append(temp);
        }
        return sb.toString();
    }
}
