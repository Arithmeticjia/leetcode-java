package trycatch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class use_throw {

    public static void main(String[] args) throws IOException {
        readMyFile();
    }

    public static void readMyFile() throws IOException {
        FileReader reader = null;
        reader = new FileReader("src/trycatch/a.txt");
        char c1 = (char)reader.read();
        if(reader != null){
            reader.close();
        }
    }
}
