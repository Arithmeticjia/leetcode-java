package HelloClassLoader;

public class TestFileSystemClassLoader {

    public static void main(String[] args) throws ClassNotFoundException {
        FileSystemClassLoader fileSystemClassLoader = new FileSystemClassLoader("/Users/Arithmetic/LearnJava/leetcode/src/HelloClassLoader");

        Class<?> c = fileSystemClassLoader.loadClass("HelloClassLoader.HelloWorld");

        System.out.println(c);
    }
}
