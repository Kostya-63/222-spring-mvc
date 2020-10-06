package web.model;

public class Car {

    String model;
    int power;
    String drivingWheels;

    public Car() {
    }

    public Car(String model, int power, String drivingWheels) {
        this.model = model;
        this.power = power;
        this.drivingWheels = drivingWheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDrivingWheels() {
        return drivingWheels;
    }

    public void setDrivingWheels(String drivingWheels) {
        this.drivingWheels = drivingWheels;
    }
}