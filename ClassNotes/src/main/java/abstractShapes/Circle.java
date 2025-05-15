package abstractShapes;

//extends keyword to inherit Shape class
public class Circle extends Shape{

    double radius;
    double diameter;

    //constructor
    public Circle (double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }


    //Override calculateArea method to return the area of a circle
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
