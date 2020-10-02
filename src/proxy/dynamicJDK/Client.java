package proxy.dynamicJDK;

import java.lang.reflect.Proxy;

/**
 * JDK代理
 * JDK动态代理必须要有接口
 */
public class Client {

    public static void main(String[] args) {
        IAccountService iAccountService = new AccountServiceImpl();

        IAccountService proxy = (IAccountService) Proxy.newProxyInstance(iAccountService.getClass().getClassLoader(),iAccountService.getClass().getInterfaces(), new AccountAdvance(iAccountService));

        proxy.transfer();
    }
}
