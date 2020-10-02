package proxy.staticproxy;

public class AccountProxy implements IAccountService{

    private IAccountService target;

    public AccountProxy(IAccountService target) {
        this.target = target;
    }

    @Override
    public void transfer() {
        before();
        target.transfer();
    }

    private void before() {
        System.out.println("对转账人身份进行验证.");
    }
}
