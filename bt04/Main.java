package btsession04.bt04;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan);
        fan.setOn(true);
        fan.setSpeed(2);
        fan.setColor("Black");
        fan.setRadius(10.6);
        System.out.println(fan);
    }
}
