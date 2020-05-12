package errors;

/**
 * java.lang.StackOverflowError
 */
public class stackoverflowerror {

    public void recursion() {
        recursion();
    }

    public static void main(String[] args) {
        stackoverflowerror test = new stackoverflowerror();
        test.recursion();
    }

}
