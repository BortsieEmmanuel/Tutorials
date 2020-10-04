package Exercises.Inheritance;

import java.util.Scanner;

public class Circle extends Geometry {
    @Override
    public double getRadius() {

        return super.getRadius();
    }

    @Override
    public double getDiameter() {
        return super.getDiameter();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public void setDiameter(double diameter) {
        super.setDiameter(diameter);
    }

    public double Area(double r){
        r = Math.PI*(getRadius()*getRadius());
        return r;
    }

    public double Circumference(double r){
    return 2*Math.PI*getRadius();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius");
        double radius = input.nextDouble();
        Circle circle = new Circle();
        circle.setRadius(radius);

        String R2dp = String.format("%.2f",circle.Area(radius));
        System.out.println("The area of the circle is :"+R2dp);
    }
}

