package reflex;

public class User {

    public String name = "liming";
    public int age = 10;
    private int id;

    public User(int age,String name){
        this.name = name;
        this.age = age;
    }

    public User(){

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setId(){
        this.id = 1;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
