package HomeWork.Lesson_2.Car;


public class CarWheel {

    private double tireIntegrity;

    public CarWheel() {
        tireIntegrity = 1;
    }

    public CarWheel(double integrity) {
        tireIntegrity = integrity;
    }

    public void setNewTire() {
        tireIntegrity = 1;
    }

    public void wipeOffTire(int percent) {
        tireIntegrity = tireIntegrity - (tireIntegrity * ((double)percent/100));
    }

    public double getTireIntegrity() {
        return tireIntegrity;
    }

    @Override
    public String toString() {
        return "CarWheel{" +
                "integrity of tire = " + tireIntegrity +
                '}';
    }
}
