package IO;

import java.io.File;

public class DirDemo02 {

    public static void main(String[] args) {
        File dir = new File("/Users/Arithmetic/LearnJava/leetcode/src/IO");

        String[] subNames = dir.list();

        for(String s: subNames != null ? subNames : new String[0]){
            System.out.println(s);
        }

        File[] subFiles = dir.listFiles();

        for(File f: subFiles){
            System.out.println(f.getAbsolutePath());
        }
    }
}
