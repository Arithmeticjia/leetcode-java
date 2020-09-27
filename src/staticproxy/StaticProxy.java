package staticproxy;

public class StaticProxy implements IHello{

    private IHello iHello;

    public void setImpl(IHello iHello) {
        this.iHello = iHello;
    }


    @Override
    public void sayHello(String name) {
        System.out.println("问候之前的日志记录...");
        iHello.sayHello(name);
    }

    @Override
    public void sayGoodBye(String name) {
        System.out.println("问候之前的日志记录...");
        iHello.sayGoodBye(name);
    }

    public static void main(String[] args) {
        Helloimplements helloimplements = new Helloimplements();
        StaticProxy staticProxy = new StaticProxy();
        staticProxy.setImpl(helloimplements);
        staticProxy.sayHello("Jerry");
        staticProxy.sayGoodBye("Jerry");
    }
}
