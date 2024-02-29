// Listing 6-6

import programFiles.Shape;

public class Polymorphic_Rectangle implements Shape {
    private Point topLeft;

    private double height;

    private double width;



    public double area() {

        return height * width;

    }
}
