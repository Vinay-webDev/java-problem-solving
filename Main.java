public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 8};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

