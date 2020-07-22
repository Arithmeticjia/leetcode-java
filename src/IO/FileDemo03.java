package IO;

import java.io.File;

public class FileDemo03 {

    public static void main(String[] args) {
        File src = new File("photo-1590258870821-88c3fb895986.jpeg");

        System.out.println(src.exists());
        System.out.println(src.isFile());
        System.out.println(src.isDirectory());

        if(src == null || !src.exists()){
            System.out.println("文件不存在");
        }else {
            if(src.isFile()){
                System.out.println("文件操作");
            }else {
                System.out.println("文件夹操作");
            }
        }
    }
}
