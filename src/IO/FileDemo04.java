package IO;

import java.io.File;
import java.io.IOException;

public class FileDemo04 {

    public static void main(String[] args) throws IOException {

        File src = new File("/Users/Arithmetic/LearnJava/leetcode/io.txt");

        boolean flag = src.createNewFile();

        System.out.println(flag);

        flag = src.delete();

        System.out.println(flag);

        System.out.println("-------------------");

        src = new File("/Users/Arithmetic/LearnJava/leetcode/IO");

        flag = src.createNewFile();

        System.out.println(flag);

        flag = src.delete();

        System.out.println(flag);
    }
}
