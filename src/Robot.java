public class Robot {
    int batteryLevel=100;
    int speed=0;
    String name="Robo";
    String color="Metalic Gray";
    int weight=200;

    public void move() {
        speed = 5;
        System.out.println(name + " is moving at speed " + speed + " mph.");
    }
    public void stop() {
        speed = 0;
        System.out.println(name + " has stopped.");
    }
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println(name + "'s battery is fully charged.");
    }
    public void checkBatteryLevel() {
        System.out.println(name + "'s current battery level is " + batteryLevel + "%.");
    }
    public void displayInfo(){
      System.out.println( name + "'s color is "+ color +" weight is " + weight + "lb.");
    }
    public static void main(String[] args) {
        Robot myRobot = new Robot();  // Create a new Robot object

        myRobot.move();               // Make the robot move
        myRobot.checkBatteryLevel();  // Check battery level
        myRobot.stop();               // Stop the robot
        myRobot.chargeBattery();// Charge the robot's battery
        myRobot.displayInfo();//color and weight
    }

}
