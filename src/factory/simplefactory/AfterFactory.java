package factory.simplefactory;

public class AfterFactory {

    public static void main(String[] args) {
        Car c1 = CarFactory.CreateCar("奥迪");
        Car c2 = CarFactory.CreateCar("奔驰");

        c1.run();
        c2.run();
    }
}
