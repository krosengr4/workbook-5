public class AssetHouse extends Asset{

    String address;
    // 1=excellent 2=good 3=fair 4=poor
    int condition;
    int squareFoot;
    int lotSize;

    public AssetHouse(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    //region getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    //endregion

    @Override
    public double getValue() {
        double totalValue = 0;

        switch (this.condition) {
            case 1:
                for (int i = 0; i < this.squareFoot; i++) {
                    totalValue += 180;
                }
                break;
            case 2:
                for (int i = 0; i < this.squareFoot; i++) {
                    totalValue += 130;
                }
                break;
            case 3:
                for (int i = 0; i < this.squareFoot; i++) {
                    totalValue += 90;
                }
                break;
            case 4:
                for (int i = 0; i < this.squareFoot; i++) {
                    totalValue += 80;
                }
                break;
            default:
                System.err.println("Error! Condition must be between 1 and 4");
                break;
        }

        for (int i = 0; i < this.lotSize; i++) {
            totalValue += .25;
        }

        return totalValue;
    }
}
