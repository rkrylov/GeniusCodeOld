package HomeWork.Lesson_2.Car;

import java.util.Arrays;

public class Car {
    private final int DATE_OF_MANUFACTURE;
    private int engineType;
    private int maxSpeed;
    private double accelerationTime;
    private int passengerCapacity;
    private int passengerQuantity;
    private int currentSpeed;
    private CarDoor[] doors = new CarDoor[0];
    private CarWheel[] wheels = new CarWheel[0];

    public Car(int dateOfManufacture) {
        DATE_OF_MANUFACTURE = dateOfManufacture;
    }

    public Car(int DATE_OF_MANUFACTURE, int engineType, int maxSpeed,
               double accelerationTime, int passengerCapacity,
               int passengerQuantity, int currentSpeed) {
        this.DATE_OF_MANUFACTURE = DATE_OF_MANUFACTURE;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.accelerationTime = accelerationTime;
        this.passengerCapacity = passengerCapacity;
        this.passengerQuantity = passengerQuantity;
        this.currentSpeed = currentSpeed;
    }

    public void changeCurrentSpeed(int speed) {
        currentSpeed = currentSpeed + speed;
    }

    public void setOnePassenger() {
        passengerQuantity++;
    }

    public void toLandOnePassenger() {
        passengerQuantity--;
    }

    public void toLandAllPassengers() {
        passengerQuantity = 0;
    }

    public CarWheel getWheel(int index) {
        return wheels[index];
    }

    public CarDoor getDoor(int index) {
        return doors[index];
    }

    public void removeAllWheels() {
        wheels = new CarWheel[0];
    }

    public void setNewWheels(int number) {
        CarWheel[] wheels2 = new CarWheel[wheels.length + number];
        if (wheels.length != 0)
            for (int x = 0; x < wheels.length; x++) {
                wheels2[x] = wheels[x];
            }
        for (int x = 0; x < wheels2.length; x++) {
            if (wheels2[x] == null)
                wheels2[x] = new CarWheel();
        }
        wheels = wheels2;
    }

    public double getCurrentMaxSpeed() {
        if (passengerQuantity == 0) {
            System.out.println("Sorry, but you don't have a driver!");
            return 0;
        }
        double theMostWipedTire = 1;
        for (int x = 0; x < wheels.length; x++) {
            if (wheels[x] != null)
                if (wheels[x].getTireIntegrity() < theMostWipedTire)
                    theMostWipedTire = wheels[x].getTireIntegrity();
        }
        return (double) maxSpeed * theMostWipedTire;
    }

    public void printCar() {
        System.out.println("Car{" +
                "Date of manufacture: " + DATE_OF_MANUFACTURE +
                ", type of engine: " + engineType +
                ", Max Speed: " + maxSpeed +
                ", Acceleration time: " + accelerationTime +
                ", Passenger Capacity: " + passengerCapacity +
                ",\r\nCurrent passenger quantity: " + passengerQuantity +
                ", CurrentSpeed: " + currentSpeed +
                ", \r\nDoors: " + Arrays.toString(doors) +
                ", \r\nWheels: " + Arrays.toString(wheels) +
                '}');
    }
}
