package TryCatchFinally;

public class HelloException {

    public static void main(String[] args) {
        try{
            System.out.println("try");
            int n = 10/0;
            return;
        }catch (Exception e){
            System.out.println("catch");
//            throw e;
//            return;
        }
        finally {
            System.out.println("finally");
        }

        System.out.println("other");
    }
}
