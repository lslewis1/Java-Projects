/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
public class Fan {
    
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    
    
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    
    String color = "blue";
    
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setOn(boolean newOn) {
        on = newOn;
    }
    
    public boolean getOn() {
        return on;
    }
    
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setColor(String newColor) {
        color = newColor;
    }
    
    public String getColor() {
        return color;
    }
    
    public void ToString() {
        if (on) {
            System.out.println("The fan's speed is: " + Integer.toString(speed) + ", and its color is " + color + ", with a radius of " + Double.toString(radius));
        }
        else {
            System.out.println("The fan is " + color + ", with a radius of " + Double.toString(radius) + ", and the fan is off.");
        }
    }
    public Fan() {
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        
        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        
        fan1.ToString();
        fan2.ToString();
    }
}
