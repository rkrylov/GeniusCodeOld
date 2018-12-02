package HomeWork.Lesson_2.Car;

public class CarDoor {

    private boolean isWindowClose;
    private boolean isDoorClose;

    public CarDoor() {
        isWindowClose = true;
        isDoorClose = true;
    }

    public CarDoor(boolean isWindowClose, boolean isDoorClose) {
        this.isWindowClose = isWindowClose;
        this.isDoorClose = isDoorClose;
    }

    public void openDoor() {
        isDoorClose = false;
    }

    public void closeDoor() {
        isDoorClose = true;
    }

    public void switchDoor() {
        if (isDoorClose) {
            openDoor();
        } else {
            closeDoor();
        }
    }

    public void openWindow() {
        isWindowClose = false;
    }

    public void closeWindow() {
        isWindowClose = true;
    }

    public void switchWindow() {
        if (isWindowClose) {
            openWindow();
        } else {
            closeWindow();
        }
    }

    @Override
    public String toString() {
        String result = "CarDoor{ window ";
        if (isWindowClose) {
            result += "close, ";
        } else {
            result += "open, ";
        }
        if (isDoorClose) {
            result += "door close}";
        } else {
            result += "door open}";
        }
        return result;
    }
}
