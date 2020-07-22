package IO;

import java.io.File;

public class DirDemo03 {

    public static void main(String[] args) {
        File src = new File("/Users/Arithmetic/LearnJava/leetcode/src/IO");
        printName(src, 0);
    }

    public static void printName(File src, int deep){
        for(int i = 0; i < deep;i++){
            System.out.print("-");
        }
        System.out.println(src.getName());
        if(!src.exists()){
            return;
        }else if(src.isDirectory()){
            for(File f: src.listFiles()){
                printName(f,deep+1);
            }
        }
    }
}
