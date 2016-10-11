package com.javarush.test.level25.lesson16.big01;

public class BaseObject {
    double x;
    double y;
    double radius;
    boolean isAlive;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.isAlive = true;
    }

    public void draw() {

    }

    public void move() {

    }

    public void die() {
        this.isAlive=false;
    }

    public boolean isIntersec(BaseObject o) {
        //дистанция_между_объектами < max (радиус_первого_объекта, радиус_второго_объекта)
        double allX = this.x - o.x;
        double allY = this.y - o.y;
        return Math.sqrt(allX * allX + allY * allY) <= Math.max(this.radius, o.radius);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
