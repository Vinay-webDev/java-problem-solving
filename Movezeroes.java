import java.util.Arrays;
public class Movezeroes {
    public static int[] movezeroes(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < n; i++) {
            arr[i] = 0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 3, 12};
        int[] arr2 = {1, 0, 3, 4, 5, 0, 2, 0};
        System.out.println(Arrays.toString(movezeroes(arr1))); //[1, 3, 12, 0, 0]
        System.out.println(Arrays.toString(movezeroes(arr2))); //[1, 3, 4, 5, 2, 0, 0, 0]
    }
}




