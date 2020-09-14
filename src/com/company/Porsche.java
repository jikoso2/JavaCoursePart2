package com.company;

public class Porsche extends Car{
    private String model;

    public Porsche(double speed, boolean hand_steering, int changing_gears, String model) {
        super(speed, hand_steering, changing_gears);
        setModel(model);
    }

    public Porsche() {
        super();
        setModel("No model");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
