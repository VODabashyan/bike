import javax.xml.transform.sax.SAXSource;
class Bike{

    private int wheel;
    private int currentSpeed;
    public static final int maxSpeed = 60;
    private int angle;


    public Bike(int wheel, int currentSpeed) {
        this.wheel = wheel;
        this.currentSpeed = currentSpeed;
        angle = 0;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void drive() {
        System.out.println("The max speed is: " + maxSpeed);
    }



    public void showInfo() {
        System.out.println("The wheel R is: " + wheel + ", current speed is: " + currentSpeed);
    }

    public void turnRight(int value) {
        angle += value;
        System.out.println("The bike turned to right by " + angle + " degrees.");
    }

    public void turnLeft(int value) {
        angle -= value;
        System.out.println("The bike turned to left by " + angle + " degrees.");
    }
}

public class New {
    public static void main(String[] args) {
        Bike mybike = new Bike(26, 30);
        mybike.drive();
        mybike.showInfo();
        mybike.turnLeft(10);

    }
}
