package factory.simplefactory;


/**
 * 调用者
 */
public class BeforeFactory {

    public static void main(String[] args) {
        Car c1 = new Audi();
        Car c2 = new Audi();

        c1.run();
        c2.run();
    }
}
