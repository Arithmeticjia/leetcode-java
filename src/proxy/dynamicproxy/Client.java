package proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        IAccountService iAccountService = new AccountServiceImpl();

        IAccountService proxy = (IAccountService) Proxy.newProxyInstance(iAccountService.getClass().getClassLoader(),iAccountService.getClass().getInterfaces(), new AccountAdvance(iAccountService));

        proxy.transfer();
    }
}
