package HomeWork.Lesson_2.Car;

public class CarDoor {

    private boolean ifWindowClose;
    private boolean ifDoorClose;

    public CarDoor() {
        ifWindowClose = true;
        ifDoorClose = true;
    }

    public CarDoor(boolean ifWindowClose, boolean ifDoorClose) {
        this.ifWindowClose = ifWindowClose;
        this.ifDoorClose = ifDoorClose;
    }

    public void openDoor() {
        ifDoorClose = false;
    }

    public void closeDoor() {
        ifDoorClose = true;
    }

    public void switchDoor() {
        if (ifDoorClose) openDoor();
        else closeDoor();
    }

    public void openWindow() {
        ifWindowClose = false;
    }

    public void closeWindow() {
        ifWindowClose = true;
    }

    public void switchWindow() {
        if(ifWindowClose) openWindow();
        else closeWindow();
    }

    @Override
    public String toString() {
        String result = "CarDoor{ window ";
        if(ifWindowClose) result += "close, ";
        else result += "open, ";
        if(ifDoorClose) result += "door close}";
        else result += "door open}";
        return result;
    }
}
