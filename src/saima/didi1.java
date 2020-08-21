package saima;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class didi1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a_v=n/200;
        List<String> res=new LinkedList<>();
        for(int a=a_v-1;a<a_v+1;a++){
            for(int b=0;b<10;b++){
                for(int c=0;c<10;c++){
                    if(200*a+10*b+12*c==n&&a!=0&&a!=b&&a!=c&&b!=c){
                        String s=" "+a+b+c+" "+a+c+c;
                        s=s.substring(1);
                        res.add(s);
                    }
                }
            }
        }
        System.out.println(res.size());
        Collections.sort(res);
        for(String s:res){
            System.out.println(s);
        }
    }
}
