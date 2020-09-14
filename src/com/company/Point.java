package com.company;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public  int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance (){
        Point ptk = new Point(0,0);
        return distance (ptk);
    }

    public double distance (int a, int b){
        Point ptk = new Point(a,b);
        return distance (ptk);
    }

    public double distance (Point ptk){
        return  Math.sqrt (Math.pow((this.x - ptk.x),2) + Math.pow((this.y - ptk.y),2));
    }
}
