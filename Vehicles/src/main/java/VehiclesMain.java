public class VehiclesMain {

    public static void main(String[] args) {

        Moped slowRide = new Moped("Red", 2, 1, 5);

        Hovercraft hoverRide = new Hovercraft("Blue", 1, 0, 4);

        Car speedyCar = new Car("Yellow", 5, 6, 35);

        SemiTruck megaTruck = new SemiTruck("Orange", 8, 24, 18);

        System.out.println("My semi truck can hold " + megaTruck.getCargoCapacity() + " tons.");
        System.out.println("My car is " + speedyCar.getColor() + " and has a fuel capacity of " + speedyCar.getFuelCapacity());
        System.out.println("My hovercraft is " + hoverRide.getColor() + " but can only hold " + hoverRide.getNumberOfPassengers() + " passenger.");
        System.out.println("My moped is " + slowRide.getColor() + " and has a fuel capacity of " + slowRide.getFuelCapacity());
    }

}
