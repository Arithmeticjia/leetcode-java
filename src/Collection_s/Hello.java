package Collection_s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.List;

public class Hello {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);

        Collection<Integer> integerCollection = new ArrayList<>();

        integerCollection.add(2);
        System.out.println(integerCollection);

        Collections.sort(list);
        System.out.println(list);
    }
}
