//Name: Garrett Radtke
//Date: 10/7/25

import java.util.Scanner;

public class DemoBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book theShining = new Book(450, "The Shining");
        Textbook arithmetic = new Textbook(200, "Arithmetic", 4);

        System.out.println("Book 1 is " + theShining.getTitle() + " with " + theShining.getPages() + " pages.");
        System.out.println("Textbook 1 is " + arithmetic.getTitle() + " with " + arithmetic.getPages() + " pages and is for grade level " + arithmetic.getGradeLevel());
        System.out.println();
        //I just bundled the triangle test and book test into one file for convenience sake
        System.out.println("Enter side 1:");
        double side1 = input.nextDouble();
        System.out.println("Enter side 2:");
        double side2 = input.nextDouble();
        System.out.println("Enter side 3:");
        double side3 = input.nextDouble();
        System.out.println("Enter color:");
        String color = input.next();
        System.out.println("Is filled (true/false):");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(color, filled, side1, side2, side3);
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());        
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }

}
