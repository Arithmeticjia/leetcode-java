package IO;

import java.io.File;

public class FileDemo02 {

    public static void main(String[] args) {

        File src = new File("/Users/Arithmetic/LearnJava/leetcode/photo-1590258870821-88c3fb895986.jpeg");

        System.out.println(src.getName());
        System.out.println(src.getPath());
        System.out.println(src.getAbsolutePath());
        System.out.println(src.getParent());
        System.out.println(src.getParentFile().getName());

    }
}
