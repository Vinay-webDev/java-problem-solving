import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
public class Findallduplicates {
    public static int[] findallduplicates(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>(); 
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                result.add(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
        int[] duplicates = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            duplicates[i] = result.get(i);
        }
        return duplicates;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 3, 2, 7, 0, 1, 2, 9};
        int[] arr2 = {1, 3, 4, 5, 4};
        int[] arr3 = {2, 3, 1, 9};
        System.out.println(Arrays.toString(findallduplicates(arr1))); //[3, 2, 2]
        System.out.println(Arrays.toString(findallduplicates(arr2))); //[4]
        System.out.println(Arrays.toString(findallduplicates(arr3))); //[]
    }
}






