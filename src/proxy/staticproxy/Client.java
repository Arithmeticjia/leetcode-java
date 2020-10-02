package proxy.staticproxy;

public class Client {

    public static void main(String[] args) {
        IAccountService iAccountService = new AccountServiceImpl();
        AccountProxy accountProxy = new AccountProxy(iAccountService);
        accountProxy.transfer();
    }
}
