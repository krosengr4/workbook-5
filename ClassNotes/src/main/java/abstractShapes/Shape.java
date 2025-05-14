package abstractShapes;

public abstract class Shape {

    //!You cannot instantiate an abstract class
    //An abstract class is a class that gathers attributes and methods,
    //but can't be used to instantiate.

    //You know you are working with an abstract class when you ask "What Type?"

    void printArea() {
        System.out.println("Area of your " + this.getClass() + ": " + this.calculateArea());
    }

    abstract double calculateArea();

}
