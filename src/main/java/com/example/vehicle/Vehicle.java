package com.example.vehicle;

public abstract class Vehicle {

    protected int engineCapacity;
    protected int manufactureYear;
    protected VehicleType vehicleType;

    public Vehicle(int engineCapacity, int manufactureYear, VehicleType vehicleType) {
        this.engineCapacity = engineCapacity;
        this.manufactureYear = manufactureYear;
        this.vehicleType = vehicleType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public abstract int calculateTax();

    public int getYearMultiplier(int manufactureYear) {
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - manufactureYear;
        if(age <= 5) {
            return 5;
        } else if (age <= 10) {
            return 4;
        } else if (age <= 15) {
            return 2;
        } else {
            return 1;
        }
    }
}
