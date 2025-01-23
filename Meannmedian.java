import java.util.Arrays;
public class Meannmedian {
    public static double[] meanandmedian(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double median = 0;
        if (n % 2 == 0) {
            int m1 = arr[n / 2 - 1];
            int m2 = arr[n / 2];
            median = (m1 + m2)/ 2;
        } else {
            median = arr[n / 2];
        }
        double mean = (double) sum / n;
        return new double[]{mean, median};
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 6, 7, 8, 9};
        int[] arr3 = {11, 12, 13, 14};
        System.out.println(Arrays.toString(meanandmedian(arr1))); //[3.0, 3.0]
        System.out.println(Arrays.toString(meanandmedian(arr2))); //[7.0, 7.0]
        System.out.println(Arrays.toString(meanandmedian(arr3))); //[12.5, 12.0]
    }
}










