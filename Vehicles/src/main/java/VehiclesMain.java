public class VehiclesMain {

    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        System.out.println("My moped is " + slowRide.getColor() + " and has a fuel capacity of " + slowRide.getFuelCapacity());
    }

}
