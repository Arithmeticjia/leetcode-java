package proxy.staticproxy;

public class AccountServiceImpl implements IAccountService{
    @Override
    public void transfer() {
        System.out.println("调用dao层,完成转账主业务.");
    }
}
