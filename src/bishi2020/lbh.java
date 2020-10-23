package bishi2020;

import java.util.ArrayList;
import java.util.List;

public class lbh {


    public static void main(String[] args) {
        List<String> userName = new ArrayList<String>() {{
            add("bmw");
            add("bz");
            add("audo");
            add("ford");
        }};

        for(String username:userName) {
            if("ford".equals(username)) {
                userName.remove("ford");
            }
        }
    }
}
