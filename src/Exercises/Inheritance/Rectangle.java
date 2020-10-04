package Exercises.Inheritance;

import java.text.DecimalFormat;

public class Rectangle extends Geometry {
    public static void main(String [] args){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5.9);
        rectangle.setLength(5.89);
    // formatting to 3dp
        DecimalFormat area3dp = new DecimalFormat("#.#");// using the decimalFormatter round the last digit up to the figure
       String Area =  area3dp.format(rectangle.AreaOfRectangle());
        System.out.println("The area of the rectangle is "+Area);
        System.out.println("The Perimeter of the Rectangle is "+rectangle.PerimeterOfRectangle());
    }

    @Override
    public double GetLength() {
        return super.GetLength();
    }

    @Override
    public double GetWidth() {
        return super.GetWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    public double AreaOfRectangle(){
        return GetWidth()*GetLength();
    }

    public double PerimeterOfRectangle(){
        return 2*(GetLength()+GetWidth());
    }
}
