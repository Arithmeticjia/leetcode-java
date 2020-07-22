package IO;

import java.io.File;

public class PathDemo01 {

    public static void main(String[] args) {
        //绝对路径
        String path = "/Users/Arithmetic/Pictures/photo-1590258870821-88c3fb895986.jpeg";
        //或者常量拼接
        //String path = "Users" + File.separator + "...";

        File src = new File(path);
        System.out.println(src.length());

        src = new File("/Users/Arithmetic/Pictures/", "photo-1590258870821-88c3fb895986.jpeg");
        System.out.println(src.length());

        //相对路径
        System.out.println(System.getProperty("user.dir"));
        src = new File("photo-1590258870821-88c3fb895986.jpeg");
        System.out.println(src.getAbsolutePath());

    }
}
