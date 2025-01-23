import java.util.Arrays;
public class Smallestnsecondsmallest {
    public static int[] smallestand2ndsmallest(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return new int[]{};
        }
        Arrays.sort(arr);
        int smallest = arr[0];
        int secondSmallest = arr[1];
        return new int[] {smallest, secondSmallest};
    }
    public static void main(String[] args) {
        int[] arr1 = {9, 11, 29, 10, 99};
        int[] arr2 = {2, 1, 33, 100};
        int[] arr3 = {1};
        System.out.println(Arrays.toString(smallestand2ndsmallest(arr1)));
        //[9, 10]
        System.out.println(Arrays.toString(smallestand2ndsmallest(arr2)));
        //[1, 2]
        System.out.println(Arrays.toString(smallestand2ndsmallest(arr3)));
        //[]
    }
}




