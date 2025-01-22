import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < n; i++) {
            d1 += arr.get(i).get(i);
            d2 += arr.get(i).get(n - 1 - i);
        }
        return Math.abs(d1 - d2);
    }
    public static void main(String[] args) {
        List<List<Integer>> arr1 = new ArrayList<>();
        arr1.add(List.of(1, 2, 3));
        arr1.add(List.of(2, 2, 8));
        arr1.add(List.of(11, 9, 4));
        System.err.println(diagonalDifference(arr1)); //9
    }
}
