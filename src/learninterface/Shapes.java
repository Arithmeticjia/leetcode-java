package learninterface;

public interface Shapes {

    public abstract double area();

    default double perimeter(){
        return 0;
    }

}
