public class Main {
    public static int findMissingNumber(int[] arr) {
         /*find the missing number */
         int n = arr.length + 1;
         int current_sum = 0;
         int actual_sum = 0;
         for (int i = 0; i < arr.length; i++) {
             current_sum += arr[i];
         }
         for (int j = 1; j <= n; j++) {
             actual_sum += j;
         }
         return actual_sum - current_sum;
    }
    public static void main(String[] args) {
       int[] arr1 = {1, 2, 3, 4, 6};
       int[] arr2 = {1, 2, 3, 5, 6};
       int[] arr3 = {1, 2, 4, 5, 6};
       System.out.println(findMissingNumber(arr1)); //5
       System.out.println(findMissingNumber(arr2)); //4
       System.out.println(findMissingNumber(arr3)); //3
    }
}
//5
