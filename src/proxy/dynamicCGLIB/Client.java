package proxy.dynamicCGLIB;

import net.sf.cglib.proxy.Enhancer;

public class Client {

    public static void main(String[] args) {
        AccountService target = new AccountService();
        AccountService proxy = (AccountService) Enhancer.create(target.getClass(),
                new AccountAdvance());
        proxy.transfer();
    }
}
