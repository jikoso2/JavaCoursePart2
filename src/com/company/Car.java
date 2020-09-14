package com.company;

public class Car extends Vehicle{
    private int changing_gears;

    public Car(double speed, boolean hand_steering,int changing_gears)   {
        super(speed, hand_steering);
        setChanging_gears(changing_gears);
    }
    public Car(){
        super(0,false);
        setChanging_gears(0);
    }

    public int getChanging_gears() {
        return changing_gears;
    }

    public void setChanging_gears(int changing_gears) {
        this.changing_gears = changing_gears;
    }

    @Override
    public void stop() {
        super.stop();
        this.changing_gears = 0;
    }
}
