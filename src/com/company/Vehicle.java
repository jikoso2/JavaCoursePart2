package com.company;

public class Vehicle {

    private double speed;
    private boolean hand_steering;
    private int direction;

    public Vehicle (double speed, boolean hand_steering){
        this.setSpeed(speed);
        this.setHand_steering(hand_steering);
    }
    public Vehicle(){
     //   this.setHand_steering(false);
      //  this.setSpeed(0);
        new Vehicle(0,false);
    }


    public void increasing_speed(double increasing){
        if(increasing < 0)
            System.out.println("Bad value");
        else
            this.speed += increasing;
    }

    public void decreasing_speed(double decreasing){
        if(decreasing < 0)
            System.out.println("Bad value");
        else
            this.speed -= decreasing;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isHand_steering() {
        return hand_steering;
    }

    public void setHand_steering(boolean hand_steering) {
        this.hand_steering = hand_steering;
    }

    public void speed() {
        System.out.println("Vehicle move " + speed);
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void steer(int direction){
        this.direction += direction;
        System.out.println("Current direction: " + direction);
    }

    public void stop(){
        this.direction = 0;
        this.speed = 0;
    }
}
