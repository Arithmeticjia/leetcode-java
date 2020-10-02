package staticproxy;

public class Client {
    public static void main(String[] args) {

        IAccountService iAccountService = new AccountServiceImpl();
        AccountProxy proxy = new AccountProxy(iAccountService);
        proxy.transfer();
    }
}
