package Oops;

public class main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "SUV", 1990);
        ElectricCar car2 = new ElectricCar("Tesla", "Model S", 2023, 400);

        Car[] A = { car1, car2 };

        for (Car car : A) {
            car.startEngine();
        }
    }
}
