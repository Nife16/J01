package weekTwo;


public class Car {

    String vin;
    String color;
    Integer numberOfWheels;
    String year;
    String make;
    String model;

    public Car() {}

    public Car(String vin, Integer numberOfWheels, String year, String make, String model) {
        this.vin = vin;
        this.numberOfWheels = numberOfWheels;
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public void drive() {}

    public void brake() {}

    public void heatSeats() {}

    public void playMusic() {}
    
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car [vin=" + vin + ", color=" + color + ", numberOfWheels=" + numberOfWheels + ", year=" + year
                + ", make=" + make + ", model=" + model + "]";
    }

}
