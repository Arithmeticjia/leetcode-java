package serializable;

import com.sun.xml.internal.ws.developer.Serialization;
import org.apache.commons.lang3.SerializationUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author arithmeticjia
 */
public class TransientTest {

    public static void main(String[] args) throws Exception {

        User user = new User();
        user.setUsername("帅帅的嘉");
        user.setId("1");

        System.out.println("\n序列化之前");
        System.out.println("username: " + user.getUsername());
        System.out.println("id: " + user.getId());

        // 对象序列化后写入txt
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("src/serializable/user.txt"));
        os.writeObject(user);
        os.flush();
        os.close();

        // 从txt读出后赋值对象
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("src/serializable/user.txt"));
        user = (User) is.readObject();
        is.close();

        System.out.println("\n序列化之后");
        System.out.println("username: " + user.getUsername());
        System.out.println("id: " + user.getId());

        // 也可以借助commons-lang3实现序列化
        byte[] bytes = SerializationUtils.serialize(user);
        User userFromLang3 = SerializationUtils.deserialize(bytes);
        System.out.println("\ncommons-lang3序列化之后");
        System.out.println("username: " + userFromLang3.getUsername());
        System.out.println("id: " + userFromLang3.getId());


    }
}

/**
 * @author arithmeticjia
 */
class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;
    private transient String id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
