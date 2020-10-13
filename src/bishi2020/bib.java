package bishi2020;

public class bib {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
        //System.out.println("Hello World!");
        String str = "1:45";
        String str2 = "空降34:26";
        String str3  = "25:34有up出现";
        System.out.print(isMatch(str2));

    }

    public static String isMatch(String str){
        for(int i = 0; i < str.length();i++){
            int ans = 0;
            if(str.charAt(i) == ':'){
                if(!Character.isDigit(str.charAt(i-1))){
                    String s = str.substring(i-1, i+3);
                    ans = (s.charAt(0) - '0') * 60 + Integer.parseInt(s.substring(2));
                    System.out.print(ans);
                    return str.substring(i-1, i+3);
                }
                String s = str.substring(i-2, i+3);
                ans = Integer.parseInt(s.substring(0,2)) * 60 + Integer.parseInt(s.substring(3,5));
                System.out.print(ans);
                return str.substring(i-2, i+3);
            }
        }
        return null;
    }
}
