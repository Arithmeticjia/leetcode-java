package learninterface;

import learnAbstract.Shape;

public class Circle implements Shapes {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}
