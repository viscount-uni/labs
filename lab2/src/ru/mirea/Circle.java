package ru.mirea;

public class Circle {
    private double radius;
    public Circle(){
        this.radius=radius;
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle's area= "+Math.pow(radius,2)*Math.PI;
    }
}
