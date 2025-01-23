import java.util.HashMap;
public class Sumofuniquenums {
    public static int sumOfUniqueNumbers(int[] arr) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int sum = 0;
        for (int num: arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        for (int num : frequency.keySet()) {
            if (frequency.get(num) == 1) {
                sum += num;
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


