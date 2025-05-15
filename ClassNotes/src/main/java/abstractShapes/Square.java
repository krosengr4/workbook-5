package abstractShapes;

//extends keyword to inherit Shape class
public class Square extends Shape {

    double length;

    //constructor
    public Square(double length) {
        this.length = length;
    }

    //Override calculateArea() method to return area of square
    @Override
    public double calculateArea() {
        return Math.pow(length, 2);
    }

}
