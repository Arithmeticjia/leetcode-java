package AlwaysTest;

import OutPackage.TestOut;

/**
 * TestOut访问权限必须是public才能被非同一个包内的类访问
 * 类访问权限就两种public和defalut
 */
public class Test1 extends TestOut {
    public static void main(String[] args) {
        System.out.print("ok");
    }
}
