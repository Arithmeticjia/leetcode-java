package trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test_try_catch {

    public static void main(String[] args) {
        FileReader reader = null;

        try{

            reader = new FileReader("src/trycatch/a.txt");
//            try {
//                char c1 = (char)reader.read();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            char c1 = (char)reader.read();
            System.out.println(c1);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
