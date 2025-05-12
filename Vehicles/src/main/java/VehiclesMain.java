public class VehiclesMain {

    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Hovercraft hoverRide = new Hovercraft();
        hoverRide.setColor("Blue");
        hoverRide.setNumberOfPassengers(1);

        Car speedyCar = new Car();
        speedyCar.setColor("Yellow");
        speedyCar.setFuelCapacity(35);

        SemiTruck megaTruck = new SemiTruck();
        megaTruck.setCargoCapacity(24);

        System.out.println("My semi truck can hold " + megaTruck.getCargoCapacity() + " tons.");
        System.out.println("My car is " + speedyCar.getColor() + " and has a fuel capacity of " + speedyCar.getFuelCapacity());
        System.out.println("My hovercraft is " + hoverRide.getColor() + " but can only hold " + hoverRide.getNumberOfPassengers() + " passenger.");
        System.out.println("My moped is " + slowRide.getColor() + " and has a fuel capacity of " + slowRide.getFuelCapacity());
    }

}
