package str;

import java.util.*;

public class countStr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String res = count(str);
            System.out.println(res);
        }
    }
    public static String count(String str)
    {
        char[] strArray=str.toCharArray();
        int[] chArray=new int[129];
        //字符对应ascll码值下标元素自增来统计数量
        for(char i:strArray) {
            chArray[(int)i]++;
        }
        int max=0;
        //找出字符数量最多的ascll码值
        for (int j : chArray) {
            if (max < j) {
                max = j;
            }
        }
        StringBuilder sb = new StringBuilder();
        //按数量从大到小添加到可变字符序列sb
        while(max != 0)
        {
            for(int i = 0;i < chArray.length;i++) {
                if(chArray[i] == max) {
                    sb.append((char)i);
                }
            }
            max--;
        }
        return sb.toString();
    }
}
