package NowcodeHuaWei;

import java.util.*;

public class tengxun22 {

    public String sumOfString(String str, int k) {
        if(str == null || str.length() <=0 ) {
            return "";
        }

        ArrayList<String> tmp = new ArrayList<>();

        HashSet<String> set = new HashSet<>();

        HashMap<Integer, String> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++ ) {
            for(int j = i+1; j<=str.length(); j++) {
                String substr = str.substring(i,j);
                set.add(substr);
            }
        }


        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.get(k);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        System.out.print(new tengxun22().sumOfString(str,k-1));

    }
}




