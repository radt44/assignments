import java.util.Scanner;

public class RectangleTest {
    private double x1, y1, x2, y2, x3, y3, x4, y4;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program uses the corner ordering of clockwise starting from the top right");
        System.out.println("Enter the rectangle's coordinates");

        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();

        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        System.out.print("x3: ");
        double x3 = sc.nextDouble();
        System.out.print("y3: ");
        double y3 = sc.nextDouble();

        System.out.print("x4: ");
        double x4 = sc.nextDouble();
        System.out.print("y4: ");
        double y4 = sc.nextDouble();

        Rectangle rect = new Rectangle(x1, y1, x2, y2, x3, y3, x4, y4);
    }
}
