package Extends;

public class Student extends Person{


    public Student(String name){
        super(name);
    }

    private int score;

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }

    public String hello(){
        return "hello" + this.name;
    }
}
