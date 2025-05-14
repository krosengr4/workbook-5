package AbstractAssetManager;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vehicle extends Asset{

    String makeModel;
    int year;
    int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
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

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter yearFormat = DateTimeFormatter.ofPattern("yyyy");
        int currentYear = Integer.parseInt(currentDate.format(yearFormat));

        int carAge = currentYear - this.year;

        double totalValue = 0;
        double totalPercentDevalue = getTotalPercentDevalue(carAge);

        if (carAge > 10) {
            totalValue = 1000.00;
        } else {
            totalValue = this.originalCost - (totalPercentDevalue * this.originalCost);
        }

        if (!this.makeModel.toLowerCase().contains("honda") && !this.makeModel.toLowerCase().contains("toyota")) {
            if (odometer > 100000) {
                totalValue = this.originalCost - (this.originalCost * .25);
            }
        }
        return totalValue;
    }

     static double getTotalPercentDevalue(int carAge) {
        double totalPercentDevalue = 1;

        for (int i = 1; i <= carAge; i++) {
            if (i <= 3) {
                totalPercentDevalue *= 1 - .03;
            }
            else if (i <= 6) {
                totalPercentDevalue *= 1 - .06;
            }
            else if (i <= 10){
                totalPercentDevalue *= 1 - .08;
            }
        }
        return totalPercentDevalue;
    }
}
