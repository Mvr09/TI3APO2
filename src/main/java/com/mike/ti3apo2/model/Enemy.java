package com.mike.ti3apo2.model;
//Similar a la clase Player, esta clase representaría a los enemigos.
public class Enemy {
    private double x;
    private double y;
    private int health;
    // ... más atributos según sea necesario

    // constructor, getters, setters...

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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
