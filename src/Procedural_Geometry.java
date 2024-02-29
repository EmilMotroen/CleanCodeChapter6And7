// Listing 6-5

import programFiles.NoSuchShapeException;

public class Procedural_Geometry {
    public final double PI = 3.141592653589793;



    public double area(Object shape) throws NoSuchShapeException

    {

        if (shape instanceof Procedural_Square) {

            Procedural_Square s = (Procedural_Square)shape;

            return s.side * s.side;

        }



        else if (shape instanceof Procedural_Rectangle) {

            Procedural_Rectangle r = (Procedural_Rectangle) shape;

            return r.height * r.width;

        }

        else if (shape instanceof Procedural_Circle) {

            Procedural_Circle c = (Procedural_Circle) shape;

            return PI * c.radius * c.radius;

        }

        throw new NoSuchShapeException();

    }
}
