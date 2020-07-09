package RecursionAndDynamicProgramming;

public class TripleStep {
    public static void main(String[] args) {
        int ways = tripleStep(6);
        System.out.println(ways);
    }
    public static int tripleStep(int n) {
        if (n == 0) return 1;
        return tripleStep(n-1) + tripleStep(n-2) + tripleStep(n-3);
    }
}
