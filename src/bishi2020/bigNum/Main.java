package bishi2020.bigNum;

import java.util.Scanner;

public class Main {

    //两个大整数相加，这里将两个整数分别存储到数组中，即拆分成一位进行相加，也可以将大整数拆分成9位(int类型最多至此10位，防止溢出，分成9位)
    private String integer1;
    private String integer2;
    private int[] array1;         //储存整数1
    private int[] array2;         //储存整数2
    private int[] result;         //储存结果
    public Main(String integer1, String integer2){
        this.integer1=integer1;
        this.integer2=integer2;
    }
    public String getSum(){     //计算两个大整数的和并返回
        int maxLength=integer1.length()>=integer2.length()?integer1.length():integer2.length();
        array1=new int[maxLength+1];    //对齐
        array2=new int[maxLength+1];
        result=new int[maxLength+1];    //结果数组的长度要比较大的整数长度大一
        for(int i=0;i<integer1.length();i++){
            array1[i]=integer1.charAt(integer1.length()-1-i)-'0';    //将整数倒叙储存到数组中
        }
        for(int i=0;i<integer2.length();i++){
            array2[i]=integer2.charAt(integer2.length()-1-i)-'0';    //将整数倒叙储存到数组中
        }
        for(int i=0;i<maxLength;i++){
            int tem=array1[i]+array2[i]+result[i];
            if(tem>=10) {               //有进位的时候，将进位存到结果的下一位
                result[i + 1] = 1;
                result[i]=tem-10;
            }else {
                result[i]=tem;
            }
        }
        StringBuilder value=new StringBuilder();
        int tag=0;
        for(int i=result.length-1;i>=0;i--){     //找到结果中第一个非0值得位置
            if(result[i]!=0){
                tag=i;
                break;
            }

        }
        for(int i=tag;i>=0;i--){                //将结果逆序存储
            value.append(result[i]);
        }
        String Sum=value.toString();
        return Sum;
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] num = str.split("#");
        String num1 = num[0];
        String num2 = num[1];
//        bigIntegerSum bigIntegerSum=new bigIntegerSum("12345678911235","8234589119212");
        Main Main =new Main(num1, num2);
        String value= Main.getSum();
        System.out.print(value);
    }
}

