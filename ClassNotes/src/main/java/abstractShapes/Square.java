package abstractShapes;

public class Square extends Shape {

    double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * 2;
    }

}
