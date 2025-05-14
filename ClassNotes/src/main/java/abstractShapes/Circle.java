package abstractShapes;

public class Circle extends Shape{

    double radius;
    double diameter;

    public Circle (double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }


    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
