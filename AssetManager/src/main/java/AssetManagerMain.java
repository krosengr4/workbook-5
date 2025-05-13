import java.util.ArrayList;

public class AssetManagerMain {

    public static void main(String[] args) {

        ArrayList<Asset> assets = createListOfAssets();

        for (Asset a: assets) {
            if (a instanceof AssetHouse) {
                System.out.println("\t\t---HOUSE---");
                System.out.printf("Description: %s | Date Purchased: %s | Original Cost: $%.2f | Current Value: $%.2f | Address: %s\n",
                        a.getDescription(), a.getDateAcquired(), a.getOriginalCost(), a.getValue(), ((AssetHouse)a).getAddress());
            } else if (a instanceof AssetVehicle) {
                System.out.println("\t\t---VEHICLE---");
                System.out.printf("Description: %s | Date Purchased: %s | Original Cost: $%.2f | Current Value: $%.2f | Make/Model: %s\n",
                        a.getDescription(), a.getDateAcquired(), a.getOriginalCost(), a.getValue(), ((AssetVehicle)a).getMakeModel());

            }
        }
    }

    public static ArrayList<Asset> createListOfAssets() {

        AssetHouse vacationHouse = new AssetHouse("Vacation House", "12-12-2003", 690000.00, "6542 Vacation Dr", 3, 1750, 2);
        AssetHouse myHouse = new AssetHouse("My usual house", "11-11-1995", 450000.00, "9851 Normal Dr", 3, 1100, 1);
        AssetVehicle myCar = new AssetVehicle("My main car", "12-23-2015", 50000.00, "Honda Accord", 2015, 135000);
        AssetVehicle luxuryCar = new AssetVehicle("My luxury car", "9-2-2018", 75500.00, "Audi R8", 2018, 22823);

        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(vacationHouse);
        assets.add(myHouse);
        assets.add(myCar);
        assets.add(luxuryCar);

        return assets;
    }
}
