public class HelloReference {
    String str = new String("hello");
    char[] chars = {'a', 'b'};

    public static void main(String[] args) {
        HelloReference helloReference = new HelloReference();
        helloReference.chage(helloReference.str,helloReference.chars);
        System.out.println(helloReference.str);
        System.out.println(helloReference.chars);
    }

    void chage(String str, char[] chars) {
        str = "ok";
        chars[0] = 'c';
    }
}
