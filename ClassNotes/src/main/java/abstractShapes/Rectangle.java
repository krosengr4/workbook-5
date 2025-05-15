package abstractShapes;

//keyword extends to inherit Shape class
public class Rectangle extends Shape{

    double length;
    double width;

    //constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Override calculateArea() method to return area of a rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

}
