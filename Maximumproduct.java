import java.util.Arrays;
public class Maximumproduct {
    public static int maximumProduct(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int maxProduct = arr[n - 2] * arr[n - 1];
        return maxProduct;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 8, 4};
        int[] arr2 = {8, 9, 1, 11, 35};
        System.out.println(maximumProduct(arr1)); //32
        System.out.println(maximumProduct(arr2)); //385
    }
}



