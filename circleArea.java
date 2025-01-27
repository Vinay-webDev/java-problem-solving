import java.util.Scanner;
public class circleArea {
    public static int areaOfCircle(double r) {
        double D = 3.14 * r * r;
        return (int)D;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double [] radii = new double[n]; 
        for (int i = 0; i < n; i++) {
            radii[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            int roundedArea = areaOfCircle(radii[i]);
            System.out.println(roundedArea); /*5 1 2 3 4 5
                                               3 12 28 50 78
                                            */
        }
    }
}
