package AbstractAssetManager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Asset> assets = createListOfAssets();

        for (Asset a : assets) {
            if (a instanceof House) {
                System.out.println("\t\t---HOUSE---");
                System.out.printf("Description: %s | Date Purchased: %s | Original Cost: $%.2f | Current Value: $%.2f | Address: %s\n",
                        a.getDescription(), a.getDateAcquired(), a.getOriginalCost(), a.getValue(), ((House) a).getAddress());
            } else if (a instanceof Vehicle) {
                System.out.println("\t\t---VEHICLE---");
                System.out.printf("Description: %s | Date Purchased: %s | Original Cost: $%.2f | Current Value: $%.2f | Make/Model: %s\n",
                        a.getDescription(), a.getDateAcquired(), a.getOriginalCost(), a.getValue(), ((Vehicle) a).getMakeModel());
            } else if (a instanceof Cash) {
                System.out.println("\t\t---CASH---");
                System.out.printf("Description: %s | Date Acquired: %s | Value: $%.2f", a.getDescription(), a.getDateAcquired(), a.getValue());
            }
        }
    }

    public static ArrayList<Asset> createListOfAssets() {

        House vacationHouse = new House("Vacation House", "12-12-2003", 690000.00, "6542 Vacation Dr", 3, 1750, 2);
        House myHouse = new House("My usual house", "11-11-1995", 450000.00, "9851 Normal Dr", 3, 1100, 1);
        Vehicle myCar = new Vehicle("My main car", "12-23-2015", 50000.00, "Honda Accord", 2015, 135000);
        Vehicle luxuryCar = new Vehicle("My luxury car", "9-2-2018", 75500.00, "Audi R8", 2018, 22823);
        Cash birthdayCash = new Cash("Cash from my birthday", "5/12/2025", 200.00);
        Cash garageSaleCash = new Cash("Cash from my garage sale", "02/12/2025", 523.89);

        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(vacationHouse);
        assets.add(myHouse);
        assets.add(myCar);
        assets.add(luxuryCar);
        assets.add((birthdayCash));
        assets.add(garageSaleCash);

        return assets;
    }
}

