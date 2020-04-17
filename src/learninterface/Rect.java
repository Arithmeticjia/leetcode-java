package learninterface;

import learnAbstract.Shape;

public class Rect implements Shapes {

    private final double width;
    private final double height;

    public Rect(double width,double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
