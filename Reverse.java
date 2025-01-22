import java.util.Arrays;
public class Reverse {
    public static int[] reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(reverse(arr1))); //[5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(reverse(arr2))); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
