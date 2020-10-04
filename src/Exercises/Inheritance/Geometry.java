package Exercises.Inheritance;

public class Geometry {
    private double width;
    private double height;
    private double diagonal;
    private double base;
    private double Length;
    private double radius;
    private double diameter;


    //Getters
    public double GetWidth(){

        return width;
    }
    public double GetHeight(){

            return height;
    }

    public double GetDiagonal(){

        return diagonal;
    }

    public double GetBase(){

        return base;
    }

    public double GetLength(){
        return Length;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    //setters
    public void setBase(double base) {

        this.base = base;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public void setDiagonal(double digonal) {
        this.diagonal = digonal;
    }

    public void setLength(double length) {
        Length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
