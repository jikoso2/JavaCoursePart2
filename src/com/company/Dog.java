package com.company;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes,int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew() {
        System.out.println("Chew");
    }

    @Override
    public void eat() {
        super.eat();
        chew();
    }

    public void walk() {
        System.out.println("Walk");
        super.move(10);
    }
    public void run() {
        System.out.println("Walk");
        move(15);
    }

    private void moveLegs(){
        System.out.println("Move Legs");
    }
    @Override
    public void move(int speed) {
        System.out.println("Move");
        moveLegs();
        super.move(speed);
    }


}
