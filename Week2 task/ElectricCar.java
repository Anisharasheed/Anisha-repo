package Oops;


class ElectricCar extends Car {
    private int battery;

    public ElectricCar(String make, String model, int year, int battery) {
        super(make, model, year); 
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void chargeBattery() {
        System.out.println("The car battery is getting charged.");
    }

    public void startEngine() {
        System.out.println("The electric car starts silently.");
    }
}
