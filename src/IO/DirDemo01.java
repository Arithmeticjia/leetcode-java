package IO;

import java.io.File;

public class DirDemo01 {

    public static void main(String[] args) {
        File dir = new File("/Users/Arithmetic/LearnJava/leetcode/src/IO/dir/test1");

        boolean flag = dir.mkdirs();

        System.out.println(flag);
    }
}
