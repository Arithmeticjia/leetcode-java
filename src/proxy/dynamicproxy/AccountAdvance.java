package proxy.dynamicproxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AccountAdvance implements InvocationHandler {

    private IAccountService target;

    public AccountAdvance(IAccountService target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        return method.invoke(target, args);
    }

    /**
     * 前置增强
     */
    private void before() {
        System.out.println("对转账人身份进行验证.");
    }
}
