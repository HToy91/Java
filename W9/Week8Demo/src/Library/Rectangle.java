package Library;

import Interface.Polygon;

import java.awt.*;
import java.util.Scanner;

public class Rectangle implements Polygon {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void getArea() {
        System.out.println("Enter the length of the Rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the Rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("The area of the Rectangle is: " + area);

    }

    @Override
    public void getPerimeter() {
        System.out.println("Enter the length of the Rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the Rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = (length + width) * 2;
        System.out.println("The perimeter of the Rectangle is: " + perimeter);
    }

    @Override
    public void getSides() {
        System.out.println("A Rectangle has 4 sides");
    }
}
