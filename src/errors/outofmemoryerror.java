package errors;

import java.util.ArrayList;

public class outofmemoryerror {

    public static void main(String[] args) {
        ArrayList<outofmemoryerror> list = new ArrayList<>();

        while(true){
            list.add(new outofmemoryerror());
        }
    }
}
