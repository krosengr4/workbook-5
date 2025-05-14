package abstractAsset;

public abstract class Asset {

    //!You cannot instantiate an abstract class
    //An abstract class is a class that gathers attributes and methods,
    //but can't be used to instantiate.
    //You know you are working with an abstract class when you ask "What Type?"

    protected String description;
    protected int yearAcquired;
    protected double originalCost;

    public Asset(String description, int yearAcquired, double originalCost) {
        this.description = description;
        this.yearAcquired = yearAcquired;
        this.originalCost = originalCost;
    }

    //region getters
    public String getDescription() {
        return description;
    }

    public int getYearAcquired() {
        return yearAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }
    //endregion

    public abstract double getValue();

}
