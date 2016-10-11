package com.javarush.test.level25.lesson16.big01;

import java.util.ArrayList;

public class Space {
    int width;
    int  height;
    SpaceShip ship;
    ArrayList<Ufo> ufos = new ArrayList<>();
    ArrayList<Rocket> rockets = new ArrayList<>();
    ArrayList<Bomb> bombs = new ArrayList<>();

    public Space(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

    }

    public void run() {

    }

    public void draw() {

    }

    public void sleep(int ms) {

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public SpaceShip getShip() {
        return ship;
    }

    public void setShip(SpaceShip ship) {
        this.ship = ship;
    }

    public ArrayList<Ufo> getUfos() {
        return ufos;
    }

    public void setUfos(ArrayList<Ufo> ufos) {
        this.ufos = ufos;
    }

    public ArrayList<Rocket> getRockets() {
        return rockets;
    }

    public void setRockets(ArrayList<Rocket> rockets) {
        this.rockets = rockets;
    }

    public ArrayList<Bomb> getBombs() {
        return bombs;
    }

    public void setBombs(ArrayList<Bomb> bombs) {
        this.bombs = bombs;
    }
}
