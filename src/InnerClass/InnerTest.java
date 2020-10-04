package InnerClass;

public class InnerTest {


    int a = 2;
    static int b = 9;
    private String str;
    private static String sstr;

    /**
     * 非静态内部类
     * 可以访问外围类的静态数据包括私有数据
     * 可以访问外围类的非静态数据包括私有数据
     */
    class Inner1{

        private int a = 10;

        void test(){
            //外围类属性
            System.out.println(a);
            //外围类静态属性
            System.out.println(b);
            //外围类私有属性
            System.out.println(str);
            //外围类静态私有属性
            System.out.println(sstr);
        }

    }

    /**
     * 静态内部类
     * 可以访问外围类的静态数据包括私有数据
     * 不可以访问外围类的非静态数据包括私有数据
     */
    static class Inner2 {

        int a = 10;

        static int b = 20;

        static private int c = 30;

        void test(){
            //外围类属性
            //System.out.println(a);
            //外围类静态属性
            System.out.println(b);
            //外围类私有属性
            //System.out.println(str);
            //外围类静态私有属性
            System.out.println(sstr);
        }

    }

    public static void main(String[] args) {

        InnerTest innerTest = new InnerTest();
        System.out.println(innerTest.new Inner1().a);
        System.out.println(Inner2.b);
        System.out.println(Inner2.c);
        System.out.println(new Inner2().a);

    }
}
