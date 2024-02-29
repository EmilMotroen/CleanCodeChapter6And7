// Listing 6-6

import programFiles.Shape;

public class Polymorphic_Circle implements Shape {
    private Point center;

    private double radius;

    public final double PI = 3.141592653589793;



    public double area() {

        return PI * radius * radius;

    }
}
