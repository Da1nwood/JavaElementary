package ua.od.hillel.lesson_7.incapsulation;

public class Auto {

    private int currentSpeed;

    public void run() {
        currentSpeed = 60;
        System.out.println("run");
    }

    public void stop() {
        currentSpeed = 0;
        System.out.println("stop");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
