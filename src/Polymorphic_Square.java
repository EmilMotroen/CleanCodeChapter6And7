// Listing 6-6

import programFiles.Shape;

public class Polymorphic_Square implements Shape {
    private Point topLeft;

    private double side;



    public double area() {

        return side*side;

    }
}
