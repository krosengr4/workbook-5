package abstractShapes;

public class Main {


    public static void main(String[] args) {


        //! You CANNOT instantiate an abstract class
        // Shape newShape = new Shape(); <---ERROR

        //! You CAN instantiate a child of abstract class
        Square square = new Square(12);
        square.printArea();

        Rectangle rectangle = new Rectangle(4, 3);
        rectangle.printArea();

        Circle circle = new Circle(12, 6);
        circle.printArea();
    }
}
