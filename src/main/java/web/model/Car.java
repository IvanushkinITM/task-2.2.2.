package web.model;

public class Car {
    private String model;
    private int series;
    private String motors;
    private String driveType;
    private String transmission;


    public Car(String model, int series, String motors, String driveType, String transmission) {
        this.model = model;
        this.series = series;
        this.motors = motors;
        this.driveType = driveType;
        this.transmission = transmission;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getMotors() {
        return motors;
    }

    public void setMotors(String motors) {
        this.motors = motors;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
