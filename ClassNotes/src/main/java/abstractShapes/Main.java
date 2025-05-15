package abstractShapes;

public class Main {


    public static void main(String[] args) {

        //! You CANNOT instantiate an abstract class
        // Shape newShape = new Shape(); <---ERROR

        //! You CAN instantiate a child of abstract class
        //Instantiating and declaring new square object and printing out the area
        Square square = new Square(12);
        double area = square.calculateArea();
        System.out.println("Area of your Square = " + area);

        //Instantiating and declaring new rectangle object and printing out the area
        Rectangle rectangle = new Rectangle(4, 3);
        rectangle.printArea();

        //Instantiating and declaring new circle object and printing out the area
        Circle circle = new Circle(12, 6);
        circle.printArea();
    }
}
