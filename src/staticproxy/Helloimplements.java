package staticproxy;

public class Helloimplements implements IHello{
    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    @Override
    public void sayGoodBye(String name) {
        System.out.println(name+" GoodBye!");
    }
}
