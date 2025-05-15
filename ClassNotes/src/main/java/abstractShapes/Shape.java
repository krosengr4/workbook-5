package abstractShapes;

public abstract class Shape {

    //!You cannot instantiate an abstract class
    //An abstract class is a class that gathers attributes and methods,
    //but can't be used to instantiate.

    //You know you are working with an abstract class when you ask "What Type?"

    //method to print out the area of instance of shape instantiated and declared in Main class
    void printArea() {
        System.out.println("Area of your " + this.getClass().toString().substring(21) + ": "+  + this.calculateArea());
    }

    //abstract method that will be override depending on shape
    abstract double calculateArea();

}
