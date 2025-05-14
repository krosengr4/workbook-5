package abstractAsset;

public class House extends Asset{

    //!You can instantiate a class that inherits from an abstract class

    private String address;
    private int squareFeet;
    private int lotSize;

    public House(String description, int yearAcquired, double originalCost, String address, int squareFeet, int lotSize) {
        super(description, yearAcquired, originalCost);
        this.address = address;
        this.squareFeet = squareFeet;
        this.lotSize = lotSize;
    }

    //region getters
    public String getAddress() {
        return address;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public int getLotSize() {
        return lotSize;
    }
    //endregion

    @Override
    public double getValue() {
        return (180 * squareFeet) + (0.25 * lotSize);
    }
}
