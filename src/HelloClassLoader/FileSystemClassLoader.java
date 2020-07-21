package HelloClassLoader;

import java.io.*;

public class FileSystemClassLoader extends ClassLoader{

    private String rootDir;

    public FileSystemClassLoader(String rootDir){

        this.rootDir = rootDir;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException{

        Class<?> c = findLoadedClass(name);

        if(c != null){
            return c;
        }else {
            ClassLoader parent = this.getParent();
            try {
                c = parent.loadClass(name);
            }catch (Exception e){
                e.printStackTrace();
            }

            if(c != null){
                return c;
            }else {
                byte[] classData = getClassData(name);
                System.out.println(classData);
                if(classData == null){
                    throw new ClassNotFoundException();
                }else {
                    c = defineClass(name, classData, 0 ,classData.length);
                }
            }
        }

        return c;
    }

    private byte[] getClassData(String className) {
        String path = rootDir + "/" + className.replace('.', '/') + ".class";
        System.out.println(path);
        InputStream is = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try {
            is = new FileInputStream(path);
            byte[] buffer = new byte[1024];
            int temp = 0;
            while ((temp = is.read(buffer)) != -1){
                baos.write(buffer,0, temp);
            }
            return baos.toByteArray();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if(is != null){
                    is.close();
                }

            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                baos.close();

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
