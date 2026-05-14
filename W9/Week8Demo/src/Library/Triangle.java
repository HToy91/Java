package Library;

import Interface.Polygon;

import java.util.Scanner;

public class Triangle implements Polygon {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void getArea() {
        System.out.println("Enter the base of the Triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the Triangle: ");
        double height = scanner.nextDouble();

        var area = 0.5 * base * height;
        System.out.println("The area of the Triangle is: " + area);
    }

    @Override
    public void getPerimeter() {
        System.out.println("Enter side A of the Triangle: ");
        double sideA = scanner.nextDouble();
        System.out.println("Enter side B of the Triangle: ");
        double sideB = scanner.nextDouble();
        System.out.println("Enter side C of the Triangle: ");
        double sideC = scanner.nextDouble();

        var perimeter = sideA + sideB + sideC;
        System.out.println("The perimeter of the Triangle is: " + perimeter);
    }

    @Override
    public void getSides() {
        System.out.println("The Triangle has 3 sides.");
    }
}
