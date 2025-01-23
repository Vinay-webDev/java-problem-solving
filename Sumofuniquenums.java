import java.util.HashSet;
import java.util.Set;
public class Sumofuniquenums {
    public static int sumOfUniqueNumbers(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                sum += arr[i];
            } else {
                sum -= arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 4};
        int[] arr2 = {2, 8, 8, 4, 4, 9, 0};
        System.out.println(sumOfUniqueNumbers(arr1)); //6
        System.out.println(sumOfUniqueNumbers(arr2)); //11
    }
}
