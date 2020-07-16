package RecursionAndDynamicProgramming;

public class RecursiveMultiply {
    public static void main(String[] args) {
        int result = recursiveMultiply(3,4);
        System.out.println(result);
    }
    public static int recursiveMultiply(int x, int y) {
        if (x < y) {
            return recursiveMultiply(y,x);
        }
        else if (y != 0) {
            return (x + recursiveMultiply(x,y-1));
        }
        else {
            return 0;
        }
    }
}
