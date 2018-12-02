package HomeWork.Lesson_2.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(2015, 8, 240, 3.6, 4,
                1, 100);
        car.setNewWheels(1);
        car.changeCurrentSpeed(60);
        car.getWheel(0).wipeOffTire(40);
        car.setNewWheels(10);
        car.printCar();
        System.out.println(car.getCurrentMaxSpeed());
    }
}
