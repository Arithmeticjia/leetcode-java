package AlwaysTest;

public class HelloClone implements Cloneable{

    public static void main(String[] args) {

        HelloClone HelloClone = new HelloClone();
        try {
            HelloClone helloClone2 = (HelloClone)HelloClone.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

