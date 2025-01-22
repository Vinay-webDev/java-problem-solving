public class Isarraysorted {
    public static boolean isarraysorted(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 3, 1, 0, 5};
        System.out.println(isarraysorted(arr1)); //true
        System.out.println(isarraysorted(arr2)); //false
    }
}
