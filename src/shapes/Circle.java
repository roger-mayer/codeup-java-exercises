package shapes;

import java.util.Scanner;

public class Circle {
    private Scanner sc = new Scanner(System.in);


    private double radius;
    private static int circleCounter = 0;

    public Circle(double radius) {
        this.radius = radius;
        circleCounter++;
    }



    public double getArea () {
        double area = (Math.PI * radius * radius);
        return area;

    }

    public double getCircum () {
        double diameter = (2 * radius);
        double circumference = (Math.PI * diameter);
        return circumference;
    }
    public int showCounter () {
        return circleCounter;
    }

}





//circumference = 2 x pi x radius
//        area = pi x (radius ^ 2)
