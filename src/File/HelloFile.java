package File;

import java.io.File;
import java.io.IOException;

public class HelloFile {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/Arithmetic/LearnJava/leetcode/src/File/a.txt");
        // 打印路径
        System.out.println(file);
        // 改名
        file.renameTo(new File("/Users/Arithmetic/LearnJava/leetcode/src/File/b.txt"));
        // 打印当前用户目录
        // /Users/Arithmetic/LearnJava/leetcode
        System.out.println(System.getProperty("user.dir"));
        // 在当前项目目录下新建文件
        File file1 = new File("c.txt");
        file1.createNewFile();
    }
}
