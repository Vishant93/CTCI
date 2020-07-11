package RecursionAndDynamicProgramming;

public class MagicIndex {
    public static void main(String[] args) {
        int[] arr = {-40,-20,-1,1,2,3,5,7,9,12,13};
        int res = magicFast(arr);
        System.out.println(res);
    }
    public static int magicFast(int[] arr) {
        return magicFast(arr,0,arr.length-1);
    }
    public static int magicFast(int[] arr, int start, int end) {
        if (end < start) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == mid) {
            return mid;
        }
        else if (arr[mid] > mid) {
            return magicFast(arr, start, mid-1);
        }
        else {
            return magicFast(arr, mid+1, end);
        }
    }
}
