import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AssetVehicle extends Asset{

    String makeModel;
    int year;
    int odometer;

    public AssetVehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    //region getters and setters
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    //endregion

    @Override
    public double getValue() {
        double totalValue = 0;
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter yearFormat = DateTimeFormatter.ofPattern("yyyy");
        int currentYear = Integer.parseInt(currentDate.format(yearFormat));

        int carAge = currentYear - this.year;


        switch (carAge) {
            case 0, 1, 2, 3:
                totalValue += this.originalCost - ((.03 * carAge) * this.originalCost);
                break;
            case 4, 5, 6:
                totalValue += this.originalCost - ((.06 * carAge) * this.originalCost);
                break;
            case 7, 8, 9, 10:
                totalValue += this.originalCost - ((.08 * carAge) * this.originalCost);
                break;
            default:
                if (carAge < 0) {
                    throw new RuntimeException("Cannot have negative car age!");
                }
                totalValue += 1000.00;
        }

        if (!this.makeModel.toLowerCase().contains("honda") && !this.makeModel.toLowerCase().contains("toyota")) {
            if (odometer > 100000) {
                totalValue = this.originalCost - (this.originalCost * .25);
            }
        }

        return totalValue;
    }
}
