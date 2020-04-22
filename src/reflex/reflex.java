package reflex;

public class reflex {


    String hhh = "ff";
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1 = String.class;

        String s = "hello";
        Class cls2 = s.getClass();

        Class cls3 = Class.forName("java.lang.String");


        boolean b1 = cls1 == cls2;

        System.out.println(b1);
        System.out.println(cls1.getName());
    }

}
